public class MainClass {
    static final int size = 10_000_000;
    static final int h = size / 2;
    static float[] arr;

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Time is method #1 : " + (System.currentTimeMillis() - a));
    }

    public static void method2(){
        arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Thread t1= new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Time is method #2 : " + (System.currentTimeMillis() - a));
    }
}

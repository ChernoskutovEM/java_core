package ru.gb.javacore_l3.home;

import java.lang.reflect.Array;
import java.util.*;

public class MainClass {
    public static void main (String[] a){
        String[] arrStr = {"A", "A", "B", "C", "D", "F", "Y", "U", "Y", "R", "N", "R", "Z",};
        System.out.println("Basic arr: " + Arrays.deepToString(arrStr));
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(arrStr));
        System.out.println("print TreeSet: " + ts);

        List<String> als = new ArrayList<>(Arrays.asList(arrStr));
        System.out.println("print ArrayL: " + als);
        Iterator<String> iterStrArL = als.iterator();
        Iterator<String> iterStrTs = ts.iterator();

        String s,s1;
        int count = 0;
        while (iterStrTs.hasNext()){
            s = iterStrTs.next();
            System.out.println(als.contains(s));
            if (als.contains(s)) {
                count = count + 1 ;
            }
            System.out.println("Элементов " + s + " в массиве всретилос раз: " + count);
        }


//            System.out.println(iterStrTs.next());


//        System.out.println();
//        while (iterStrArL.hasNext()) System.out.println(iterStrArL.next());






//        for (int i = 0; i < ts.size() ; i++) {
////            System.out.println(als.get(i));
//            s = ts.;
//            while (iterStrArL.hasNext()){
//                if (s == iterStrArL.next()) {
//                    count +=count;
//                }
//            }
//            System.out.println("Элементов " + s + " в массиве всретилос раз: " + count);
//            count = 0;
//        }
    }

}

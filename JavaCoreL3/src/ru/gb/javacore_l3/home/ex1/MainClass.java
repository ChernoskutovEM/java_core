package ru.gb.javacore_l3.home.ex1;

import java.util.*;

public class MainClass {
    public static void main (String[] a){
        String[] arrStr = {"D", "A", "D", "A", "D", "A", "Y", "U", "Y", "R", "N", "R", "Z",};
        System.out.println("Basic arr: " + Arrays.deepToString(arrStr));
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(arrStr));
        System.out.println("print TreeSet: " + ts);

        List<String> als = new ArrayList<>(Arrays.asList(arrStr));
        System.out.println("print ArrayL: " + als);
        Iterator<String> iterStrArL = als.iterator();
        Iterator<String> iterStrTs = ts.iterator();

        String s, s2;
        int count = 0;
        while (iterStrTs.hasNext()){
            s = iterStrTs.next();

            while (iterStrArL.hasNext()){
                s2 = iterStrArL.next();
                if (s.equals(s2)) count++;
            }
            iterStrArL = als.iterator();
            System.out.println("Элементов " + s + " в массиве встретилос раз: " + count);
            count = 0;
        }
    }
}

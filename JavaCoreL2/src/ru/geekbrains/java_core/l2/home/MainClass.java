package ru.geekbrains.java_core.l2.home;

import jdk.nashorn.internal.runtime.arrays.ArrayData;
import ru.geekbrains.java_core.l2.home.my_exception.MyArrayDataException;
import ru.geekbrains.java_core.l2.home.my_exception.MyArraySizeException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr = {
                {"4","5","7","8"},
                {"1","2","3","4"},
                {"5","6","7","c"},
                {"1","2","3","4"}
        };
        System.out.println("Arr[4][4]: " + Arrays.deepToString(arr));
        method(arr);

    }



    private static void method(String[][] arr){
        Integer sum = 0;
        try {
            if (arr.length != 4){
                throw new MyArraySizeException();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4){
                    throw new MyArraySizeException();
                }
            }
        }catch (MyArraySizeException e){}
        for (String[] s:arr) {
            for(String s2:s){
                try {
                    sum += Integer.parseInt(s2);
                }catch (NumberFormatException e){
                    try {
                        throw new MyArrayDataException(4, 2, s2); //не знаю как получить индекс элемента массива задал вопрос наставнику. Через for понимаю как.
                    }catch (MyArrayDataException k){}
                }
            }
        }
        System.out.println("Sum all elements of array: " + sum);
    }

}


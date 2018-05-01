package ru.geekbrains.java_core.l2.home.my_exception;

public class MyArrayDataException extends MyException {
    public MyArrayDataException(int y, int x, String value) {
        super("error converting a string to a number Arr[" + y + "][" + x + "].value = " + "\"" + value + "\"");
    }
}

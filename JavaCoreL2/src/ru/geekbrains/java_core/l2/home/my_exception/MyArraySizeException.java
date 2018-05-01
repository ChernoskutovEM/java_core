package ru.geekbrains.java_core.l2.home.my_exception;

public class MyArraySizeException extends MyException {

    public MyArraySizeException() {
        super("the size of the array does not match the expectation");
    }
}

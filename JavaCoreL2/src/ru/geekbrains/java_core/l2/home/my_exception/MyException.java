package ru.geekbrains.java_core.l2.home.my_exception;

public abstract class MyException extends Exception{
    public MyException(String message) {
        super(message);
        super.printStackTrace();
    }
}

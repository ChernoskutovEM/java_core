package ru.gb.javacore_l3.home.ex2;

public class MainClass {
    public static void main(String[] args) {
        ContactBase cb = new ContactBase();
        cb.printAllContact();

        cb.add("Иноземцев", "+79881123");
        cb.printAllContact();
        cb.get("Шпаченко");
        cb.get("Иванов");
    }
}

package ru.gb.javacore_l3.home.ex2;

import java.util.HashMap;

public class ContactBase {
    private HashMap<String, String> hmContactB = new HashMap<>();
    public int c = 0;

    public ContactBase() {
        this.hmContactB.put("Иванов",   "+77922613138");
        this.hmContactB.put("Петров",   "+77999222244");
        this.hmContactB.put("Иванов",  "+75565555444");
        this.hmContactB.put("Шпаченко", "+79135613138");
        this.hmContactB.put("Крючков",  "+79132343138");
        this.hmContactB.put("Рыбин",    "+79130234538");
    }

    public void printAllContact(){
        System.out.println(hmContactB);
    }

    public void add(String name, String tel) {
        this.hmContactB.put(name, tel);
    }
    public void get(String name){
        System.out.println(name + " " + this.hmContactB.getOrDefault(name, "not founded"));
    }
}

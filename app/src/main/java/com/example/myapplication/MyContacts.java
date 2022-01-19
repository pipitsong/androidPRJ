package com.example.myapplication;

public class MyContacts {
    private String name;

    public MyContacts(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hi: " + name;
    }
}

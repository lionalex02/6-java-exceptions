package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        String str = codeWithNPE();

    }

    static String codeWithNPE() {
        String str = null;
        System.out.println(str.length());
        return str;
    }
}


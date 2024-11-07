package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        String callerMethodName = stackTrace[2].getMethodName();

        System.out.print(callerMethodName);

    }


}
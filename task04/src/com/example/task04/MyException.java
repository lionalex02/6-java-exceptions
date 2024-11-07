package com.example.task04;

public class MyException extends IllegalArgumentException{

    public MyException(String monthNumber) {
         super(monthNumber);
    }
}

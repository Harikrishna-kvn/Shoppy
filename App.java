package com.yourcompany;

public class App {
    public String getMessage() {
        return "Hello, Maven!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}

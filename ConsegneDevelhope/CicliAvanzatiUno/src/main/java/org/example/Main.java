package org.example;

public class Main {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
            if (x == 5) {
                break;
            }
        }
    }
}
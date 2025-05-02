package org.example;

public class Main {
    public static void main(String[] args) {
    int x = 20;
    int y = 15;

        System.out.print(x + ", ");
        System.out.println(y);

        boolean maggiore = x > y;
        System.out.println(x + " è più grande di " + y + " - " + maggiore);

        boolean minore = x < y;
        System.out.println(x + " è più piccolo di " + y + " - " + minore);

        boolean uguale = x == y;
        System.out.println(x + " è uguale a " + y + " - " + uguale);

        boolean diverso = x != y;
        System.out.println(x + " è diverso da " + y + " - " + diverso);
    }
}
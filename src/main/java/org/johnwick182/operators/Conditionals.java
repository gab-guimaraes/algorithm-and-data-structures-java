package org.johnwick182.operators;

public class Conditionals {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            i++;
            System.out.println(i);
        } while (i < 6);

        String country = "EUA®";

        switch (country) {
            case "Brazil":
                System.out.println("america do sul");
                break;
            default:
                System.out.println("nao e america");

        }
    }
}

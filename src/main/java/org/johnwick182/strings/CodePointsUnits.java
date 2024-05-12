package org.johnwick182.strings;

public class CodePointsUnits {
    public static void main(String[] args) {
        //strings are created as char array
        String greeting = "Hello";
        int n = greeting.length();
        System.out.println(n);
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        System.out.println("first is " + first + " last is " + last);
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);
    }
}

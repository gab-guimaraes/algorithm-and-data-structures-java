package org.johnwick182.strings;

public class StringOperations {
    public static void main(String[] args) {
        //we use equals method to compare strings
        String character = "scooby";
        boolean result = character.equals("scooby");
        System.out.println(result);
        //ignore lower/upper case
        boolean result2 = "Hello".equalsIgnoreCase("hello");
        System.out.println(result2);

        System.out.println(checkEmpty(""));
        System.out.println(checkEmpty2(""));

    }

    public static boolean checkEmpty(String string) {
        return string.isEmpty();
    }

    public static boolean checkEmpty2(String string) {
        return string.length() == 0;
    }
}

package org.johnwick182.strings;

public class CamelCase {


    public static void main(String[] args) {

    }

    public static int countWords(String word) {
        //String word = "helloWorld";
        int countWords = 1;
        for (char letter : word.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                countWords++;
            }
        }
        return countWords;
    }
}

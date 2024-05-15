package org.johnwick182.exercises;

public class Palindromell {
    //check if is palindrome removing 1 letter

    public static void main(String[] args) {
        String textoOriginal = "boanoite";
        int indiceRemover = 3;

        String firstPart = textoOriginal.substring(0, 3);
        String secondPart = textoOriginal.substring(4);

        System.out.println(firstPart+secondPart);


    }

    public static boolean validWithoutLetter(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                //first
                return isPalindrome(word, start++, end) || isPalindrome(word, start, end--);
            }
        }
        start++;
        end++;

        return true;
    }

    public static boolean isPalindrome(String word, int start, int end) {
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end++;
        }
        return true;
    }
}

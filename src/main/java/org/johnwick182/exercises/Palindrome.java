package org.johnwick182.exercises;

public class Palindrome {

    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    public static boolean isPalindrome(String word) {
        //1. remove spaces and normalize
        //2. reverse and check
        //3. algorithm to check
        word = word.replaceAll("[^a-zA-Z0-9]", "");
        word = word.toLowerCase();
        System.out.println(word);
        char[] letters = word.toCharArray();
        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            if (letters[start] != letters[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}

package org.johnwick182.exercises;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {

    }

    public static boolean isPangram(String word) {
        if (word.isEmpty())
            return false;

        Set<Character> map = new HashSet<>();

        for (char letter : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(letter)) {
                map.add(letter);
            }
        }
        return map.size() == 26;
    }
}

package org.johnwick182.exercises;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        //adding all numbers in hashset O(1) search
        for (int number : nums) {
            set.add(number);
        }

        int longestSequence = 0;

        for (int number : nums) {
            //check if the sequence is in the middle of other sequence
            if (!set.contains(number - 1)) {
                //yes it's a new sequence
                int currentNum = number;
                int currentSequence = 1; //at least 1 number
                //loop to search the current + 1 in hashset
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        return longestSequence;
    }
}

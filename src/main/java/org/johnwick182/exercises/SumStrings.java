package org.johnwick182.exercises;

public class SumStrings {


    public static void main(String[] args) {
        System.out.println(solution("one-one")); //0
        System.out.println(solution("two+two")); //4
        System.out.println(solution("one+two+one")); //4
        System.out.println(solution("one+one+one+one+one")); //5
        System.out.println(solution("one+two-one-one+two+one")); //4
        System.out.println(solution("one")); //1
        System.out.println(solution("two")); //2
    }

    public static int solution(String s) {
        //return 0 if String is empty
        if (s.isEmpty())
            return 0;

        //if length is 3 there's only one number, return it
        if (s.length() == 3)
            return transformSimpleChar(s);

        int i = 3;
        int sum = transformSimpleChar(s.substring(0,3));
        //loop to transform char into numbers
        while (i < s.length() - 3) {
            int amount = transformCharNumber(s.substring(i,i+4));
            sum = sum + amount;
            i = i + 2;
        }
        return sum;
    }

    //help function to convert string into numbers with operator
    public static int transformCharNumber(String value) {
        switch(value) {
            case "-one":
                return -1;
            case "+one":
                return +1;
            case "-two":
                return -2;
            case "+two":
                return + 2;
        }
        return 0;
    }

    //help function to convert string into numbers without operator
    public static int transformSimpleChar(String value) {
        if (value.equals("one"))
            return 1;
        return 2;
    }
}

package org.johnwick182.operators;

public class BasicOperators {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(n); //12
        n++;
        System.out.println(n); //13
        ++n;
        System.out.println(n); //14
        int a = 2 * ++n;
        System.out.println(a); //30 = 2 * 15
        System.out.println(a == 30);
        System.out.println(3 != 7);
        System.out.println(3 != 7 && 8 > 8);
        //ternary condition ? exp1 : exp2
        int x = 10;
        int y = 2;
        System.out.println(x < y ? "x is smaller" : "y is smaller");
        int age = 18;
        System.out.println(age >= 18 ? "adult" : "young");
        String result = age >= 18 ? "adult" : "young";
    }
}

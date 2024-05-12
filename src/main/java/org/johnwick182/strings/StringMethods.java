package org.johnwick182.strings;

public class StringMethods {
    public static void main(String[] args) {
        String apple = "apple";
        String banana = "banana";
        String watermellon = "watermelon";
        System.out.println(apple.compareTo(banana));
        System.out.println(watermellon.compareTo(banana));
        System.out.println(apple.startsWith("a"));
        System.out.println(banana.endsWith("z"));
        //indexOf returns -1 if the char does not exist
        System.out.println("ipad".indexOf("z")); //-1
        //in this case will return
        System.out.println("ipad".indexOf("d")); //3
        System.out.println("headphone".indexOf("phone"));
        System.out.println("mouse".indexOf(2));
        System.out.println("estojo".lastIndexOf("jo"));

        System.out.println("lucifer".length());
        System.out.println("lucifer".toUpperCase());

    }
}

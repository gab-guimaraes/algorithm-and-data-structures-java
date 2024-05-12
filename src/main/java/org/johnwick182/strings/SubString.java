package org.johnwick182.strings;

public class SubString {
    public static void main(String[] args) {
        String lucifer = "lucifer";
        //fer
        System.out.println(lucifer.substring(4));
        //luci
        System.out.println(lucifer.substring(0, 4));

        System.out.println(lucifer.replace('i', '1'));
        System.out.println(lucifer.replaceAll("luci", "lucy"));

    }
}

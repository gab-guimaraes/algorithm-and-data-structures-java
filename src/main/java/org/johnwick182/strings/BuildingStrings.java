package org.johnwick182.strings;

public class BuildingStrings {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lucifer");
        stringBuilder.append(" is ");
        stringBuilder.append("a good series ");
        String completed = stringBuilder.toString();
        System.out.println(completed);
    }
}

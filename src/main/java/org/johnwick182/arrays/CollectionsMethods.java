package org.johnwick182.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gabriel");
        list.add("veronica");
        list.add("gabriel");
        list.add("amenadiel");
        Collections.replaceAll(list, "gabriel", "gabrielita");
        System.out.println("///");
        list.replaceAll(String::toUpperCase);
        Collections.swap(list, 0 , 1);

        list.forEach(System.out::println);
        Collections.rotate(list, 4);
        int f = Collections.frequency(list, "GABRIELITA");
        System.out.println(f);

    }
}

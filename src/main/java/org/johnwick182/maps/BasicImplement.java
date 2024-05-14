package org.johnwick182.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicImplement {
    public static void main(String[] args) {
        Map<String, Car> stringCarMap = new HashMap<>();
        stringCarMap.put("lancer", new Car("lancer", "mitsubishi", 380));
        stringCarMap.put("wrx", new Car("wrx", "subaru", 290));
        System.out.println(stringCarMap.get("lancer"));
        System.out.println(stringCarMap.get("wrx"));
        System.out.println(stringCarMap.getOrDefault("fusca", new Car("not found", "not found", 0)));
        Map<String, Car> italianCards = new HashMap<>();
        italianCards.put("ferrari", new Car("enzo", "ferrari", 500));
        //add other hashmap to
        stringCarMap.putAll(italianCards);
        System.out.println(stringCarMap.get("ferrari"));

        if (italianCards.containsKey("ferrari")) {
            System.out.println("founded");
        }


    }

    static class Car {
        String name;
        String model;
        int hp;

        public Car(String name, String model, int hp) {
            this.name = name;
            this.model = model;
            this.hp = hp;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", hp=" + hp +
                    '}';
        }
    }
}

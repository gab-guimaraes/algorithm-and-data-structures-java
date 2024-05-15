package org.johnwick182.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.johnwick182.maps.WorldCupCountries.countriesWorldCup;

public class ForHashMap {
    public static void main(String[] args) {

        WorldCupCountries worldCupCountries = new WorldCupCountries();

        //first method
        for (Map.Entry<String, Integer> entry : countriesWorldCup.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        countriesWorldCup.forEach((k,v) -> {
            //System.out.println("key: " + k + " value: " + v);
        }) ;
        hashToArray(countriesWorldCup).forEach(System.out::println);
    }

    public static ArrayList<String> hashToArray(HashMap<String, Integer> hashMap) {
        ArrayList<String> concat = new ArrayList<>();
        countriesWorldCup.forEach((k,v) -> {
            concat.add(k + v);
        });
        return concat;
    }
}

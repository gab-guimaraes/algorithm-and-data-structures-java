package org.johnwick182.maps;

import static org.johnwick182.maps.WorldCupCountries.countriesWorldCup;

public class ChangeValues {
    public static void main(String[] args) {

        countriesWorldCup.put("Brazil", 5);
        countriesWorldCup.put("Australia", 0);
        countriesWorldCup.put("Italia", 4);
        countriesWorldCup.put("Spain", 2);
        countriesWorldCup.put("Japan", 0);


        //suppose we'd like to increase some numbers.
        System.out.println(countriesWorldCup.get("Brazil"));
        //first option (if the result is null the code will break
        countriesWorldCup.put("Brazil", countriesWorldCup.get("Brazil") + 1);
        System.out.println(countriesWorldCup.get("Brazil"));

        //second option (use get or default)
        countriesWorldCup.put("Brazil", countriesWorldCup.getOrDefault("Brazil", 0) + 1);
        System.out.println(countriesWorldCup.get("Brazil"));

        //third option add if not exist
        countriesWorldCup.putIfAbsent("Brazil", 0);

        //fourth option
        countriesWorldCup.merge("Mexico", 1, Integer::sum);

        System.out.println(countriesWorldCup.get("Mexico"));

        //apply some changes in all hashmap
        countriesWorldCup.replaceAll((produto, quantidade) -> quantidade * 2);
        System.out.println(countriesWorldCup.get("Mexico"));

    }
}

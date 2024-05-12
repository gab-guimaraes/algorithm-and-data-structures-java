package org.johnwick182.strings;

public class Immutability {
    public static void main(String[] args) {
        /*strings are immutable
        this line create a variable called name with 'harry potter' value
        its a reference from name to harry potter*/
        String name = "harry potter";
        System.out.println(name);
        /*this line "change" the value, removing the old reference
        and add the new reference from name to hermione*/
        name = "Hermione";
        /*the garbage collector is responsible for checking the unused
        variables / references and deleting it.*/
    }
}

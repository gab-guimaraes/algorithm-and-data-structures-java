package org.johnwick182.arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        String[] movies = new String[3];
        movies[0] = "Harry Potter";
        movies[1] = "Hunger Games";
        movies[2] = "Twilight";
        //for example, I'd like to add more movies
        String[] newMovies = Arrays.copyOf(movies, 6);
        System.out.println(Arrays.toString(newMovies));
        //fill the new indexes with null
        //[Harry Potter, Hunger Games, Twilight, null, null, null]

        movies[0] = "Harry Potter2";
        System.out.println(Arrays.toString(movies));
        System.out.println(Arrays.toString(newMovies));

    }
}

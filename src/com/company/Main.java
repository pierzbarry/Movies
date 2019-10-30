package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        Scanner key = new Scanner(System.in);

        boolean repeat = true;

        do {
            System.out.println("Enter the name of your favorite movie:");
            movies.add(key.nextLine());

            System.out.println("Would you like to add another movie? Or you can end the program by typing q");
            if(key.nextLine().equalsIgnoreCase("q")) {
                repeat = false;
            }
        } while (repeat);

        Collections.sort(movies);
        System.out.println("Your favorite movies are: " + movies);
        System.out.println("Here is my suggestion as to what you should watch: "
                + movies.get(random(movies.size())));
    }

    public static int random(int bound) {
        Random r = new Random();
        return(r.nextInt(bound));
    }
}

package com.company1;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//	    Animal theAnimal = new Animal                           ();

        var map = new HashMap<Integer, String>();



        map.put(1, "Bob");
        map.put(2, "Tom");
        map.put(3, "Sam");

        if (map.containsKey(1)) {
            System.out.println(map.get(1));
        }

        System.out.println();


        System.out.println(map);


    }
}

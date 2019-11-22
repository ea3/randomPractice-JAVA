package com.example.dev.ea3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//	    String [] string1 = "Yo soy tu negro que te quiere y tu eres la que me domina".split(" ");
//	    for( int i = 0 ; i < string1.length; i++){
//            System.out.println(string1[i]);
//        }
//        System.out.println(Arrays.toString(string1));


        Map<String, String> names = new HashMap<>();
        names.put("Emilio", "Araos");
        names.put("Mariela", "Araos");
        names.put("Silvia", "Araos");
        names.put("Olga", "Shraybman");
        names.put("Tom", "Brady");
        names.put("Antonio", "Brown");

//        System.out.println(names.get("Emilio"));
//        System.out.println(names.get("Silvia"));

        for(String loop: names.keySet()){
            System.out.println(loop + " : " + names.get(loop));
        }

        System.out.println(" Write a name: ");

        String name = scanner.nextLine();
        System.out.println();


         if(names.containsKey(name)){
             System.out.println("Mariela was found in the  Map");
         }else{
             System.out.println(name + " was not found in the map");
         }

         if(name.length() > 1){
             String [] nombreCompuesto = name.split(" ");
             for(String compuesto : nombreCompuesto) {
                 System.out.println(compuesto);

             }


         }

    }
}


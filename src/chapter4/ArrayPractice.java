package chapter4;


import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.in;

public class ArrayPractice {

    public static void main(String[] args) {

        HashMap<String, List<String>> countries = new HashMap<>();


        List<String> S = new ArrayList<>(){
            {
                add("Saint Kitts and Nevis");
                add("Saint Lucia");
                add("Saint Vincent and the Grenadines");
                add("Samoa");
                add("San Marino");
                add("Sao Tome and Principe");
                add("Saudi Arabia");
                add("Senegal");
                add("Serbia");
                add("Seychelles");
                add("Sierra Leone");
                add("Singapore");
                add("Slovakia");
                add("Slovenia");
                add("Solomon Islands");
                add("Somalia");
                add("South Africa");
                add("South Korea");
                add("South Sudan");
                add("Spain");
                add("Sri Lanka");
                add("Sudan");
                add("Suriname");
                add("Eswatini");
                add("Sweden");
                add("Switzerland");
                add("Syria");
            }
        };


        List<String> G = new ArrayList<>(){
            {
                add("Gabon");
                add("Gambia");
                add("Georgia");
                add("Germany");
                add("Ghana");
                add("Greece");
                add("Grenada");
                add("Guatemala");
                add("Guinea");
                add("Guinea-Bissau");
                add("Guyana");
            }
        };

        List<String> U = new ArrayList<>(){
            {
                add("Uganda");
                add("Ukraine");
                add("United Arab Emirates");
                add("United Kingdom");
                add("United States");
                add("Uruguay");
                add("Uzbekistan");
            };


        };

        //Add key values to hashmap
        countries.put("S", S);
        countries.put("G", G);
        countries.put("U", U);

        List<String> result = countries.get("S");

        for(String country : result){
            System.out.println(country + " ");
        }


    }

}

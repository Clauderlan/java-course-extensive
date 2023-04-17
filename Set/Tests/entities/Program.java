package exercicios.Set.Tests.entities;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Vasco");
        set.add("Da");
        set.add("Gama");

        System.out.println(set.contains("Vasco"));
        //set.removeIf(x -> x.length() < 3); // Predicate
        //System.out.println(set.remove("Vasco")); // return false, if not contains
        for(String x : set){
            System.out.println(x);
        }
    }
}

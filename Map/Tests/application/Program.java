package exercicios.Map.Tests.application;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map<Integer, String> myList = new HashMap<>();
        myList.put(1,"Clauderlan"); // Put data on map, key + value.
        myList.put(2,"anothers.");

        for (String x : myList.values()){
            System.out.println(x);
        }

        for (int key : myList.keySet()) {
            System.out.println(key + ": " + myList.get(key));
        }
    }
}

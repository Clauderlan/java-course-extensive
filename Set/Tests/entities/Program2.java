package exercicios.Set.Tests.entities;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1,3,5,6,23));

        //Union
        Set<Integer> setUnion = new TreeSet<>(set); // Copy set to unionSet
        setUnion.addAll(set2);
        System.out.println(setUnion);

        //Intersection
        Set<Integer> setIntersection = new TreeSet<>(set);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);

        //Diference
        Set<Integer> setDiference = new TreeSet<>(set);
        setDiference.removeAll(set2);
        System.out.println(setDiference);
    }
}

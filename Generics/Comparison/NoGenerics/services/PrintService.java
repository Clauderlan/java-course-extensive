package exercicios.Generics.Comparison.NoGenerics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();

    public void addValue(int value){
        list.add(value);
    }

    public int first(){
        return list.get(0);
    }
    public void print(){
        System.out.print("[");
        System.out.print(first());

        for(int x = 1; x < list.size(); x++){
            System.out.print(", " + list.get(x));
        }
        System.out.print("]");
    }


}

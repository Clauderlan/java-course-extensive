package exercicios.Generics.Comparison.WithGenerics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
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

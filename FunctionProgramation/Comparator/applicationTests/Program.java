package exercicios.FunctionProgramation.Comparator.applicationTests;

import exercicios.FunctionProgramation.Comparator.entitiesTests.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {


    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Alemao", 450.00));

        // Compare clean
        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // Compare with Anonymous Function or Arrow Function.
        // -> productList.sort((p1,p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));

        // Compare with Class myComparator
        // -> productList.sort(new MyComparator());

        for(Product x : productList){
            System.out.println(x.getName());
        }
    }

}

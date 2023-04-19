package exercicios.FunctionProgramation.FunctionsInterfaces.Predicate.application;

import exercicios.FunctionProgramation.FunctionsInterfaces.Predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 80.90));

        productList.removeIf(x -> x.getPrice() > 100); // Predicate Lambda

        // productList.removeIf(new ProductPredicate()); // Predicate implements by class

        for(Product x : productList){
            System.out.println(x);
        }
    }
}

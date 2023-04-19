package exercicios.FunctionProgramation.FunctionsInterfaces.Consumer.application;

import exercicios.FunctionProgramation.FunctionsInterfaces.Consumer.util.ProductConsumer;
import exercicios.FunctionProgramation.FunctionsInterfaces.Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 80.90));

        productList.forEach(x -> x.setPrice(x.getPrice() + 100));// Consumer Lambda

        // productList.forEach(new ProductConsumer());// Consumer implements by class

        productList.forEach(System.out::println); // Consumer Lambda to println
    }
}

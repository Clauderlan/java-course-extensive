package exercicios.FunctionProgramation.FunctionsInterfaces.Function.application;

import exercicios.FunctionProgramation.FunctionsInterfaces.Function.entities.Product;
import exercicios.FunctionProgramation.FunctionsInterfaces.Function.util.myFunctionUpper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 80.90));

        List<String> productListUpper = productList.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());// Function Lambda with map

        // List<String> productListUpper = productList.stream().map(new myFunctionUpper()).collect(Collectors.toList());// Function implements by class

        productListUpper.forEach(System.out::println); // Consumer to System.out.println to all objects

    }
}

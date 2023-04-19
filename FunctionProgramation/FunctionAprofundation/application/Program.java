package exercicios.FunctionProgramation.FunctionAprofundation.application;


import exercicios.FunctionProgramation.FunctionAprofundation.entities.Product;
import exercicios.FunctionProgramation.FunctionAprofundation.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 80.90));

        ProductService productService = new ProductService();
        double totalSum = productService.filteredSum(productList, x -> x.getName().charAt(0) == 'T'); // Passing a function in arguments
        System.out.println(totalSum);
    }
}

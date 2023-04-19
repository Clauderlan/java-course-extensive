package exercicios.FunctionProgramation.FunctionAprofundation.services;

import exercicios.FunctionProgramation.FunctionAprofundation.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> productList, Predicate<Product> required){
        double totalSum = 0;

        for(Product x : productList){
            if(required.test(x)){
                totalSum += x.getPrice();
            }
        }
        return totalSum;
    }
}

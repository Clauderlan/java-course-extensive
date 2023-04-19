package exercicios.FunctionProgramation.FunctionsInterfaces.Function.util;


import exercicios.FunctionProgramation.FunctionsInterfaces.Function.entities.Product;

import java.util.function.Function;

public class myFunctionUpper implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}

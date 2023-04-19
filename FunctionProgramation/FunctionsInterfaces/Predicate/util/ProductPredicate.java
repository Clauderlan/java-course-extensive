package exercicios.FunctionProgramation.FunctionsInterfaces.Predicate.util;

import exercicios.FunctionProgramation.FunctionsInterfaces.Predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() > 100;
    }
}

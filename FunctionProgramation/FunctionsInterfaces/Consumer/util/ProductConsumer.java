package exercicios.FunctionProgramation.FunctionsInterfaces.Consumer.util;

import exercicios.FunctionProgramation.FunctionsInterfaces.Consumer.entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice( product.getPrice() + 100);
    }
}

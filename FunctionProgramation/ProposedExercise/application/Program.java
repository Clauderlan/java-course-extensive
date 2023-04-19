package exercicios.FunctionProgramation.ProposedExercise.application;

import exercicios.FunctionProgramation.ProposedExercise.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {


    public static void main(String[] args) {

        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FunctionProgramation\\ProposedExercise\\files\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            List<Product> productList = new ArrayList<>();
            while (line != null){
                String[] lineSplit = line.split(",");
                Product product = new Product(lineSplit[0], Double.parseDouble(lineSplit[1]));
                productList.add(product);
                line = br.readLine();
            }

            double sumAvg = productList.stream()
                    .map(x -> x.getPrice())
                    .reduce(0.0, (x,y) -> x+y) / productList.size();

            List<Product> productsDescPrice = productList.stream()
                    .filter(x -> x.getPrice() < sumAvg)
                    .collect(Collectors.toList());

            Comparator<String> nameDesc = (x,y) -> x.toUpperCase().compareTo(y.toUpperCase());

            List<String> nameDescList = productsDescPrice.stream().map(x -> x.getName()).sorted(nameDesc.reversed()).collect(Collectors.toList());

            System.out.println("Avarage " + String.format("%.2f", sumAvg));
            nameDescList.forEach(System.out::println);

        }catch (IOException e){
            System.out.println(e.getMessage());
        };
    }

}

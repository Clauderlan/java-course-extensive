package exercicios.Generics.Comparison.WithGenerics.entities;


import exercicios.Generics.Comparison.WithGenerics.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();
        System.out.println("How many values ? ");
        int values = scanner.nextInt();

        for (int x = 0; x < values; x++){
            String value = scanner.next();
            printService.addValue(value);
        }

        printService.print();
        System.out.println(printService.first());

    }
}

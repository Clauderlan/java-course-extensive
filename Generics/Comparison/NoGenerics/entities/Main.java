package exercicios.Generics.Comparison.NoGenerics.entities;

import exercicios.Generics.Comparison.NoGenerics.services.PrintService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();
        System.out.println("How many values ? ");
        int values = scanner.nextInt();

        for (int x = 0; x < values; x++){
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println(printService.first());

    }
}

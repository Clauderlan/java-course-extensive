package exercicios.FunctionProgramation.ProposedExercise2.application;

import exercicios.FunctionProgramation.ProposedExercise2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FunctionProgramation\\ProposedExercise2\\files\\in.txt";


        try (Scanner scanner = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            List<Employee> employeeList = new ArrayList<>();
            while (line != null) {
                String[] lineSplit = line.split(",");
                Employee employee = new Employee(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]));
                employeeList.add(employee);
                line = br.readLine();
            }

            System.out.println("Enter salary:");
            double value = scanner.nextDouble();

            List<String> emailsOverValue = employeeList.stream()
                    .filter(x -> x.getSalary() > value)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            double salaryWithM = employeeList.stream().
                    filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (total, salary) -> total + salary);

            emailsOverValue.forEach(System.out::println);
            System.out.println("Total with 'M' " + salaryWithM);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

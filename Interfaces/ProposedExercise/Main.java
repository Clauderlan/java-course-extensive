package exercicios.Interfaces.ProposedExercise;

import exercicios.Interfaces.ProposedExercise.InterfacePayment.OnlinePaymentService;
import exercicios.Interfaces.ProposedExercise.InterfacePayment.PaypalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero do contrato : ");
        int contractNumber = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Data (d/mm/yyyy) : ");
        LocalDate contractDate = LocalDate.parse(scanner.next(), formatter);

        System.out.println("Valor do contrato :");
        double contractValue = scanner.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.println("Parcelas : ");
        int installmentT = scanner.nextInt();


        ContractService contractService = new ContractService(new PaypalPaymentService());
        contractService.processContract(contract, installmentT);


    }
}

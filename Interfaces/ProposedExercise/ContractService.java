package exercicios.Interfaces.ProposedExercise;

import exercicios.Interfaces.ProposedExercise.InterfacePayment.OnlinePaymentService;
import exercicios.Interfaces.ProposedExercise.InterfacePayment.PaypalPaymentService;

import java.time.LocalDate;

public class ContractService {
    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService paymentService){
        this.onlinePaymentService = paymentService;
    }

    void processContract(Contract contract, int months){
        Installment[] installments = new Installment[months];
        double portion = contract.getContractValue() / months;

        for(int x = 0; x < months; x++){
            LocalDate month = contract.getContractDate().plusMonths(x+1);
            Double amount = portion + onlinePaymentService.interest(portion, x+1);
            amount += onlinePaymentService.paymentFree(amount);

            installments[x] = new Installment(month, amount);
        }

        contract.setInstallments(installments);

        for(Installment x : contract.getInstallments()){
            System.out.println(x.toString());
        }
        // Gerar uma lista de Installments.
    }
}

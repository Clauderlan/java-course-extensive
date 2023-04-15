package exercicios.Interfaces.ProposedExercise.InterfacePayment;

public class PaypalPaymentService implements OnlinePaymentService{

    @Override
    public Double paymentFree(double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(double amount, int months) {
        return (0.01 * amount) * months;
    }
}

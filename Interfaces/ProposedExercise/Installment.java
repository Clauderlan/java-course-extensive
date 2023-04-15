package exercicios.Interfaces.ProposedExercise;

import java.time.LocalDate;

public class Installment {
    LocalDate dueDate;
    Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toString(){
        return "Data : " + this.getDueDate() + "   Amount : " + this.getAmount();
    }
}

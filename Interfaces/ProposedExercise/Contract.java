package exercicios.Interfaces.ProposedExercise;

import java.time.LocalDate;

public class Contract {

    private Integer contractNumber;
    private LocalDate contractDate;
    private Double contractValue;
    private Installment[] installments;

    public Contract(Integer contractNumber, LocalDate contractDate, Double contractValue) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractValue = contractValue;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }

    public Installment[] getInstallments() {
        return installments;
    }

    public void setInstallments(Installment[] installments) {
        this.installments = installments;
    }
}

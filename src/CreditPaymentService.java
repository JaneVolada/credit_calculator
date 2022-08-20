public class CreditPaymentService {
    public double calculate(double creditAmount, double creditTerm) {
        double interestRate = ((9.99 / 12) / 100);
        double coefficient = (interestRate * Math.pow(1 + interestRate, (creditTerm * 12))) / (Math.pow(1 + interestRate, (creditTerm * 12)) - 1);
        return coefficient * creditAmount;

    }
}

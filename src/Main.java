public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита 1000000 рублей, срок кредита 1 год");
        System.out.println("Ежемесячный платеж");
        System.out.printf("%.0f", service.calculate(1_000_000, 1));

        System.out.println();
        System.out.println("Сумма кредита 1000000 рублей, срок кредита 2 года");
        System.out.println("Ежемесячный платеж");
        System.out.printf("%.0f", service.calculate(1_000_000, 2));

        System.out.println();
        System.out.println("Сумма кредита 1000000 рублей, срок кредита 3 года");
        System.out.println("Ежемесячный платеж");
        System.out.printf("%.0f", service.calculate(1_000_000, 3));


    }
}

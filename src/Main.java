public class Main {
    public static void main(String[] args) {
        MonthlyPayment service = new MonthlyPayment();
        float CreditPaymentService1 = service.calculate(1_000_000F, 12F, (float) 9.99);
        System.out.println(CreditPaymentService1);
        System.out.println("");
        float CreditPaymentService2 = service.calculate(1_000_000F, 24F, (float) 9.99);
        System.out.println(CreditPaymentService2);
        System.out.println("");
        float CreditPaymentService3 = service.calculate(1_000_000F, 36F, (float) 9.99);
        System.out.println(CreditPaymentService3);
        System.out.println("");
    }
}


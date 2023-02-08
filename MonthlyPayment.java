public class MonthlyPayment {
    public static void main(String[] args) {
    monthlyPayment(12000, 2, 12);
    }

    public static double monthlyPayment(int principleLoanAmount, int years, int interestRate){
        int termInMonths = 12 * years;
        double monthlyPayment =
                (principleLoanAmount*interestRate) /
                        (1-Math.pow(1+interestRate, -termInMonths));
        System.out.println("The monthly payment is " + monthlyPayment);
        return monthlyPayment;
    }
}

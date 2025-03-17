import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal , roi , times, period;
        System.out.print("Please Enter the Principal amount: ");
        principal = input.nextDouble();
        System.out.print("Please Enter the Interest Rate: ");
        roi = input.nextDouble()/100;
        System.out.print("Please Enter the number of times interest is compounded per year: ");
        times = input.nextDouble();
        System.out.print("Please Enter the years: ");
        period = input.nextDouble();
        double amount = principal * Math.pow(1 + roi / times, times * period);
        System.out.println(amount);
        input.close();
    }
}
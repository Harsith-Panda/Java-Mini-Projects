import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        /*
            functionalities:
            1. Show Balance
            2. Desposit
            3. Withdraw
            4. Exit
         */
        Scanner input = new Scanner(System.in);
        // variables
        double amount = 0;
        double deposit;
        double withdraw;
        int choice;
        boolean hasExited;

        while (true) {
            System.out.println("1. Show Balance");
            System.out.println("2. Desposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter the correct option: ");
            choice = input.nextInt();
            hasExited = false;

            switch (choice) {
                case 1 -> System.out.println("Current balance: " + amount);
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    deposit = input.nextDouble();
                    amount += deposit;
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = input.nextDouble();
                    if (amount < withdraw) {
                        System.out.println("Insufficient Balance!! ");
                    } else {
                        amount -= withdraw;
                        System.out.println("Amount Withdrawn! ");
                        System.out.println("Current Balance: " + amount);
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using HBS!! ");
                    hasExited = true;
                }
                default -> System.out.println("Enter correct option.");
            }
            if (hasExited) break;
        }

        input.close();
    }
}

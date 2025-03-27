import java.util.Scanner;

public class BankingOOPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount harsith = new BankAccount("Harsith",20000);
        boolean isRunning = true;
        while (isRunning) {
            int option;
            int amount;
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. With Draw");
            System.out.println("4. Exit");
            System.out.print("Enter valid option: ");
            option = input.nextInt();
            switch (option) {
                case 1 -> harsith.showBalance();
                case 2 -> {
                    amount = input.nextInt();
                    harsith.deposit(amount);
                }
                case 3 -> {
                    amount = input.nextInt();
                    harsith.withdraw(amount);
                }
                case 4 -> {
                    System.out.println("Thank You!!!");
                    isRunning = false;
                }
                default -> System.out.println("Enter a correct option!!!");
            }
        }
    }
    public static class BankAccount {
        String owner;
        float balance;
        BankAccount(String own, float bal) {
            this.owner = own;
            this.balance = bal;
        }
        void deposit(int amount) {
            this.balance += amount;
            this.showBalance();
        }
        void withdraw (int amount){
            if (this.balance >= amount) {
                this.balance -= amount;
                this.showBalance();
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        void showBalance() {
            System.out.println("Balance: " + this.balance);
        }
    }
}


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value1, value2;
        char operation;
        System.out.print("Please Enter the first number: ");
        value1 = input.nextDouble();
        System.out.print("Please Enter the second number: ");
        value2 = input.nextDouble();
        System.out.print("Select the following operations (+, -, /, *, ^): ");
        operation = input.next().charAt(0);

        switch (operation) {
            case '+' -> System.out.println(value1 + value2);
            case '-' -> System.out.println(value1 - value2);
            case '*' -> System.out.println(value1 * value2);
            case '/' -> {
                if (value2 != 0) {
                    System.out.println(value1 / value2);
                } else {
                    System.out.println("Can not divide by Zero");
                }
            }
            case '^' -> System.out.println(Math.pow(value1, value2));
            default -> System.out.println("Enter a correct Operation!");
        }

        input.close();
    }
}

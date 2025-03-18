import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int value = random.nextInt(1,101);
        while (true) {
            System.out.print("Guess a number: ");
            int val = input.nextInt();
            if (val == value) {
                System.out.println("Congratulations! You Won!");
                break;
            } else if (val > value) {
                System.out.println("Ahh! Your guess is greater than the value. Try a lesser value.");
            } else {
                System.out.println("Ahh! Your guess is lesser than the value. Try a bigger value.");
            }
        }
        input.close();
    }
}

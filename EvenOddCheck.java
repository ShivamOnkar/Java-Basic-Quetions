//write a java program to accept a number and check whethere the number is
// even or not . prints 1 if the number is even or 0 if odd
import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("1"); 
        } else {
            System.out.println("0"); 
        }

        scanner.close();
    }
}


import java.util.Scanner;

public class EvenOddSumDif{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int evenSum = 0, oddSum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            
            number /= 10;
        }
        
        int difference = Math.abs(evenSum - oddSum);
        
        System.out.println("Difference between even and odd digit sums: " + difference);
        scanner.close();
    }
}

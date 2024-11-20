import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d , rev=0;
        int orino =n;

        while(n!=0){
            d = n%10;
            rev = rev * 10 + d;
            n = n/10;
        }

        if(rev==orino){
            System.out.println("Palidrome number!");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        sc.close();
    }
}

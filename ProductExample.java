import java.util.Scanner;
public class ProductExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  ///154 =1*5*4=20
        int divisor = sc.nextInt(); //3
        int d, p=1;
        while(n!=0){
            d = n%10;
            p = p*d;
            n = n/10;
        }

        //6/divisor ==> reminder 0 it is divisible
        if(p%divisor==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println(" Not Divisible");
        }
        sc.close();
    }
    
}

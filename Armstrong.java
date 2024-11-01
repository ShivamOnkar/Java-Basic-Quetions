import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0,d;
        int count=0;
        int temp =n;

        while(n!=0){
            count++;
            n = n/10;
        }
        
        n = temp;
        while(n!=0){
            d = n%10;
            s = s + (int) Math.pow(d, count);
            n= n/10;

        }
        if(s==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
    
}
//153   =  1^3 + 5^3 + 3^3 

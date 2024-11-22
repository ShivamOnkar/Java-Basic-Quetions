import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int d;

        while(n!=0)
        {
            d = n%10;
            if(d%2==0)
            {
                s = s + d;
            }
            n = n/10;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}

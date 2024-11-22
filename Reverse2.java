import java.util.Scanner;

public class Reverse2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = Integer.toString(n);
        StringBuilder sb = new StringBuilder(t);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);
        sc.close();
    }
}
//StringBuilder === StringBuffer
import java.util.Arrays;
public class SortDigits {
    public static void main(String args[]){
        int n = 5243;
        String num = Integer.toString(n);
        char c[] = num.toCharArray();
        Arrays.sort(c);
        String num2 = new String(c);
        for(int i = num2.length()-1;i>=0;i--){
            System.out.print(num2.charAt(i));
        }
       
    }
    
}

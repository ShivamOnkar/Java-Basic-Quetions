public class RemoveDigits {
    public static void main(String args[]){
        int n = 234567;
        int remDigit =5;
        System.out.println(n);
    
        String num = Integer.toString(n);
        num = num.replace(Integer.toString(remDigit),"");
       int newnum = Integer.parseInt(num);
        System.out.println(newnum);
    
    }
}

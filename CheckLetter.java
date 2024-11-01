public class CheckLetter {
    public static void main(String args[]){
         String s = "hell#o";
        boolean f = true;
        for (int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                f = true;
            }
            else{
                f = false;
                break;
            }
        }
        if(f){
          System.out.println(1);  
        }
        else{
            System.out.println(0);  
        }
    }
}



 /*String s = "hell#o3467";
    boolean f = true;
    int count =0;
        for (int i=0;i<=s.length()-1;i++){
            if(!Character.isLetter(s.charAt(i))){
                count++;
}}
  System.out.println(count);
}}   */        
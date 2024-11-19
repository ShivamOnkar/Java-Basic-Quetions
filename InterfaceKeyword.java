interface A{
     void fun1();
     void fun2();
   

}
interface B{
     void fun3();
}
class C implements A,B{
    public void fun1(){
    System.out.println("fun 1 in child");
    }
    public void fun2(){
        System.out.println("fun 2 in child");
    }
     public void fun3(){
         System.out.println("fun 3 in child");
    }
}
class Demo{
    public static void main(String args[]){
        A obj = new C();
        obj.fun1();
        obj.fun2();
        B obj2 = new C();
        obj2.fun3();
    }
}
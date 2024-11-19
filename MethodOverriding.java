class MethodOverriding {
   void show()
   {
    System.out.println("Parent method");
   } 
}
class B extends MethodOverriding{
    void show(){
        System.out.println("Child method");
    }
}
class Demo1{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}

//run-time polymorphism
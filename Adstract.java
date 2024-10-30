//we can not create object of abstract class
//abstract method nust be override in child class
//abstract class must be extended


abstract class Adstract {
    abstract void fun1();
    void fun2(){
        System.out.println("Fun2 function in parent class");
    }
}

class B extends Adstract{
    void fun1()
    {
        System.out.println("Fun1 function in child class");
    }
}

class Demo{
    public static void main(String args[]){
        Adstract obj = new B();
        obj.fun1();
        obj.fun2();
    }
}
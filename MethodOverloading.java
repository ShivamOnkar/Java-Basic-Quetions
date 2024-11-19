 class MethodOverloading {
    
    void sum(int a,int b){
        System.out.println("Sum = "+(a+b));
    }
    void sum(float a, float b){
        System.out.println("Sum = "+(a+b));
    }
}

class Demo{
    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        obj.sum(8.5f,2.5f);
        obj.sum(2,5);  
    }
}

//complie time polymorphism,,early static
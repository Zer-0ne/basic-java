public class Sub {
    Sub(){
        System.out.println("\n\n2. Method Overloading!!");
    }
    void subtract(int a,int b){
        System.out.println("The subtraction :: "+(a-b));
    }
    void subtract(double a, double b){
        System.out.println("The subtraction :: "+(a-b));
    }
}

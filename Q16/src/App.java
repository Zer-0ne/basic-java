public class App {
    public static void main(String[] args) throws Exception {
        finalClass obj = new finalClass();
        obj.finalMethod();
    }
}

// final keyword means we cant overwrite the value of any final object in future during writing code other wise it gives an error "The final local variable finalVariable cannot be assigned. It must be blank and not using a compound" assignment
final class finalClass{
    final void finalMethod(){
        final int finalVariable=100;
        System.out.println(finalVariable);
    }
}


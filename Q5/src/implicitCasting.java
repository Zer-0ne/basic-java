public class implicitCasting {
    implicitCasting(){
        System.out.println("\n\n1.Implicit Casting ");
        byte n=100;
        int m =n;
        System.out.println(n +" is of type "+((Object)n).getClass().getSimpleName());
        System.out.println("Casting byte to int!!");
        System.out.println(m +" is of type "+((Object)m).getClass().getSimpleName());
    }
}

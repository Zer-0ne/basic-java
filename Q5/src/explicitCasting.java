public class explicitCasting {
    explicitCasting(){
        System.out.println("\n2. Explicit Casting");
        long longNum = 100;
        int intNum = (int) longNum;
        System.out.println(longNum +" is of type "+((Object)longNum).getClass().getSimpleName());
        System.out.println("Casting long to int!!");
        System.out.println(intNum +" is of type "+((Object)intNum).getClass().getSimpleName());
    }
}

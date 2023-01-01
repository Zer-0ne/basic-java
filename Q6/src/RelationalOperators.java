import java.util.Scanner;
public class RelationalOperators {
    RelationalOperators(){
        System.out.println("\n\n1.Rational Condition");
        System.out.println("Enter the value of i :: ");
        Scanner n = new Scanner(System.in);
        int i=n.nextInt();
        if( i==0){
            System.out.println("i is 0");
        }
        else if(i==1){
            System.out.println("i is 1");
        }
        else{
            System.out.println("All of above rational condition are false");
        }
    }
}

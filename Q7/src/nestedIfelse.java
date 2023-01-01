import java.util.Scanner;

public class nestedIfelse {
    nestedIfelse(){
        System.out.println("\n\n1. Nested if else");
        System.out.print("Enter the number :: ");
        Scanner n = new Scanner(System.in);
        int num=n.nextInt();
        if(num<100){
            if(num%2==0){
                System.out.println(num+" is smaller than 100 and even number");
            }
            else{
                System.out.println(num+" is smaller than 100 but not even number (odd number)");
            }
        }
        else{
            System.out.println(num+" is greater than 100");
        }
    }
}

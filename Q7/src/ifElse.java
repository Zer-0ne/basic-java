import java.util.Scanner;

public class ifElse {
    ifElse(){
        System.out.println("\n\n1. if else");
        System.out.print("Enter the number :: ");
        Scanner n = new Scanner(System.in);
        int num=n.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
    }
}

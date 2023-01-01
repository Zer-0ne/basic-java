import java.util.Scanner;

public class ladderIfelse {
    ladderIfelse(){
        System.out.println("\n\n1. Nested if else");
        System.out.print("Enter the number :: ");
        Scanner n = new Scanner(System.in);
        int num=n.nextInt();
        if (num<0) {
            System.out.println(num+" is a negative number");
        }
        else if (num==0){
            System.out.println(num+" is zero");
        }
        else if(num>0){
            System.out.println(num+" is a positive number");
        }
        else{
            System.out.println("invalid input!!");
        }
    }
}

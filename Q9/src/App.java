import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your age :: ");
        Scanner n = new Scanner(System.in);
        int age = n.nextInt();
        String result = (age<18)?"Your not adult!!":"Congrats You are adult!!";
        System.out.println(result);
    }
}

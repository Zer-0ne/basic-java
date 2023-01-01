import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the length of a Room :: ");
        double len =n.nextDouble();
        System.out.print("Enter the width of a Room :: ");
        double width =n.nextDouble();
        new Area(len, width);
    }
}

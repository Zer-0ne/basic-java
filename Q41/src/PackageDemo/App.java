package PackageDemo;

import MyPackage.Calculate;

public class App {
    public static void main(String[] args) throws Exception {
        Calculate calculate = new Calculate();
        System.out.println("The addition :: "+calculate.add(10, 40));
        System.out.println("The division :: "+calculate.divide(50, 10));
        System.out.println("The volumn of cubeboid :: "+calculate.volumn(25, 54, 60));
    }
}

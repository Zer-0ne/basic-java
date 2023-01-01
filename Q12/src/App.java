public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Method overloading and constructor overloading!!");
        new Add();
        new Add(5, 10);
        new Add(5.5, 10.5);
        Sub num = new Sub();
        num.subtract(10, 5);
        num.subtract(100.5, 200.4);
    }
}

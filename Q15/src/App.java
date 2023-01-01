public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Q. WAP to demonstrate method overriding in hierarchical inheritance.\n\n");
        A objA = new A();
        objA.printInfo();

        B objB = new B();
        objB.printInfo();

        
        C objC = new C();
        objC.printInfo();
    }
}

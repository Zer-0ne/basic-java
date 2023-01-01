public class App {
    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay() {
        System.out.println("\n\n1. Simple Display Method\n" + a);
        System.out.println(b);
    }

    // Declaration of a static method.
    static void staticDisplay() {
        System.out.println("\n\n2. Static Display Method\n" + a);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Static variable & Static Method!!");
        App obj = new App();

        // calling simple method
        obj.simpleDisplay();

        // calling static method
        staticDisplay();
    }
}

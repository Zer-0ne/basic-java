public class App {
    public static void main(String[] args) throws Exception {
        Hello h1 = new Hello();
        h1.print();
    }
}
/**
 * Printable
 */
interface Printable {
    void print();
}
class Hello implements Printable{
    @Override
    public void print() {
        System.out.println("hello world!");    
    }
}
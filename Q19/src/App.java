public class App {
    public static void main(String[] args) throws Exception {
        // public access modifier
        Public publicObj = new Public();
        publicObj.name = "Sahil khan";
        publicObj.Name();

        // Private access modifier
        Private privateObj = new Private();
        privateObj.setAge(10);
        System.out.println(privateObj.getAge());

        // protected acccess modifier
        Protected obj = new Protected();
        obj.display();
    }
}

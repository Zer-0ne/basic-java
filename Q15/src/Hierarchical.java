public class Hierarchical {
    void printInfo(){
        System.out.println("Hierarchical class");
    }
}
class A extends Hierarchical{
    void printInfo(){
        System.out.println("A class");
    }
}
class B extends Hierarchical{
    void printInfo(){
        System.out.println("B class");
    }
}
class C extends Hierarchical{
    void printInfo(){
        System.out.println("C class");
    }
}
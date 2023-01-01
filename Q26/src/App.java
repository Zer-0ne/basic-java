import java.io.*;
public class App extends Parent1,Parent2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
 
//  Class 1
// A Grand parent class in diamond
class GrandParent {
 
  void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Grandparent");
  }
}
 
// Class 2
// First Parent class
class Parent1 extends GrandParent {
  void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Parent1");
  }
}
 
// Class 3
// Second Parent Class
class Parent2 extends GrandParent {
  void fun() {
 
    // Print statement to be executed when this method is called
    System.out.println("Parent2");
  }
}
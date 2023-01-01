public class App extends Thread {
    public static void main(String[] args) throws Exception {
        App thread = new App();
        thread.start();
        System.out.println("This code is outside of the thread");




        Runable run1 = new Runable();
        Thread t1 = new Thread(run1);
        t1.start();
        System.out.println("hi");
    }
    public void run(){
        System.out.println("this code is running in  a thread");
    }


}
class Runable implements Runnable{
    public void run(){
        System.out.println("thread has ended");
    }
}
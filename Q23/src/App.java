public class App {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer("Hello ");

        // append 
        sb.append("Java"); // now original string is changed
        System.out.println(sb);

        // insert 
        sb.insert(1, "Java");
        System.out.println(sb);

        // replace
        sb.replace(1, 3, "Java");
        System.out.println(sb);

        // delete
        sb.delete(1, 3);
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);

        // capacity
        System.out.println(sb.capacity()); //default 16
        sb.append("hello");
        System.out.println(sb.capacity()); //now 16
        sb.append("java is my favourite languge");
        System.out.println(sb.capacity());
        // Now (16*2)+2 = 34 i.e (oldcapacity*2)+2

    }
}
public class BitwiseOperator {
    BitwiseOperator() {
        System.out.println("\n\n1.Bitwise Condition");
        int x = 9, y = 8;

        // bitwise and
        // 1001 & 1000 = 1000 = 8
        System.out.println("x & y = " + (x & y));

        // bitwise XOR
        // 1001 ^ 1000 = 0001 = 1
        System.out.println("x ^ y = " + (x ^ y));

        // bitwise inclusive OR
        // 1001 | 1000 = 1001 = 9
        System.out.println("x | y = " + (x | y));

        // bitwise compliment
        // ~0010= 1101 = -3
        System.out.println("~x = " + (~x));
    }
}

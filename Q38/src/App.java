// Java implementation to find
// the sum of series
// 1 + x^2 + x^3 + ....+ x^n

public class App {

  // Java code to print the sum
  // of the given series
  static double sum(int x, int n) {
    double i, total = 1.0, multi = x;

    // First Term
    System.out.print("1 ");

    // Loop to print the N terms
    // of the series and compute
    // their sum
    for (i = 1; i < n; i++) {
      total = total + multi;
      System.out.print(multi);
      System.out.print(" ");
      multi = multi * x;
    }

    System.out.println();
    return total;
  }

  // Driver Code
  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    System.out.printf("%.2f", sum(x, n));
  }
}

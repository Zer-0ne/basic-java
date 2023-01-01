import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    int n =4;
    String names[]={"Bharti","Ziya","Rufia","Kisa"};
    String temp;
    for (int i=0;i<=n;i++){
      for(int j=i+1;j<n;j++){
        if (names[i].compareTo(names[j])>0){
          //swaping
          temp = names[i];
          names[i]=names[j];
          names[j] = temp;
        }
      }
    }
    // print output array
    System.out.println("The names in alphabetical order are :: ");
    for(int i=0;i<n;i++){
      System.out.println(names[i]);
    }
  }
}
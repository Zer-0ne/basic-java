import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new WordCounter();
    }
}
class WordCounter{
    int word,chars,spaces,lines;
    WordCounter(){
        System.out.print("Enter the sentence :: ");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        word += n.split("\\s").length;spaces += word-1;chars += n.length(); lines += n.split("\\n").length;
        System.out.println("The total words in the sentence :: "+word);
        System.out.println("The total characters in the sentence :: "+chars);
        System.out.println("The total spaces in the sentence :: "+spaces);
        System.out.println("The total lines in the sentence :: "+lines);
        
    }
}
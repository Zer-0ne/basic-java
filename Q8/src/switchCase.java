import java.util.Scanner;

public class switchCase {
    switchCase(){
        System.out.println("\n\nSwitch Case");
        System.out.print("Enter the day number (less than 8) ::");
        Scanner n = new Scanner(System.in);
        int dayNum = n.nextInt();
        String dayName;
        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break;
        
            case 2:
                dayName = "Tuesday";
                break;
        
            case 3:
                dayName = "Wednesday";
                break;
        
            case 4:
                dayName = "Thursday";
                break;
        
            case 5:
                dayName = "Friday";
                break;
        
            case 6:
                dayName = "Saturday";
                break;
        
            case 7:
                dayName = "Sunday";
                break;
        
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println(dayName);
    }
}

import java.time.LocalDate;
import java.util.Scanner;
import java.time.DateTimeException;

public class Date {

    public static void main (String[] args){

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter date");
        int date = sc.nextInt();

        System.out.println("Enter month");
        int month = sc.nextInt();

        System.out.println("Enter year");
        int year = sc.nextInt();

        try {
            LocalDate localDate = LocalDate.of(year, month, date);
            System.out.println("Vaild Date");
        } catch (DateTimeException e) {
            System.err.println(e);
        }

            
    }
    
}
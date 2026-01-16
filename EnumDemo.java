import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY, SUNDAY
}



public class EnumDemo {

    public static void dayCharker(Day day){

        if (day == Day.SATURDAY || day == Day.SUNDAY){
            System.out.println("Weekend");
        }

        else{
            System.out.println("Working day");
        }

    }
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day");

        String input = sc.nextLine().toUpperCase();

        try{
             Day day = Day.valueOf(input);
             dayCharker(day);
        }
        catch(IllegalArgumentException e){
            System.err.println(e);
        }
       

    }
}

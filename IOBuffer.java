import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOBuffer {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt",true));

            System.out.println("Enter number of employee to enter");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){

            System.out.println("Enter employee ID");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee name");
            String name = sc.nextLine();
            

            System.out.println("Enter employee department");
            String department= sc.nextLine();
            

            System.out.println("Enter employee salary");
            int salary = sc.nextInt();
            sc.nextLine();

            writer.write(id +","+name +","+department +","+salary);
            writer.newLine();
            }
            writer.close();

            int count = 0;
            String line;
            while((line = reader.readLine()) != null){
                String[] columns = line.split(",");
                if(columns.length <= 3){
                    try {
                        int salary = Integer.parseInt(columns[3].trim());
                        if (salary > 50000){
                            count ++;
                             System.out.println(line);
                             
                        }
                       
                    } catch (Exception e) {
                        System.out.println("salary handling error");
                        e.printStackTrace();
                    }
                
                }

            }
            reader.close();
            System.out.println("count: "+count);

        } catch (IOException e) {
            System.err.println("File handling error");
            e.printStackTrace();
        }
        sc.close();
    }
}

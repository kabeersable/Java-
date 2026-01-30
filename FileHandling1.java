import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); // Scanner to take user input

        try {
            File file = new File("Employee.txt"); // File object for employee data

            // Create the file if it doesn't exist
            if (file.createNewFile()){
                System.out.println("File is created successfully");
            }
            else{
                System.out.println("File already exists");
            }

            // FileWriter in append mode to keep previous records
            FileWriter writer = new FileWriter(file, true);

            System.out.println("Enter number of employees to enter");
            int n = sc.nextInt(); // Number of employees user wants to input

            // Loop to take multiple employee inputs
            for(int i = 0; i < n; i++){
                System.out.println("Enter employee id");
                int id = sc.nextInt();  // Read employee id

                sc.nextLine();          // Consume leftover newline from nextInt()

                System.out.println("Enter employee name");
                String name = sc.nextLine(); // Read employee name

                writer.write(id + "," + name + "\n"); // Write record in "id,name" format
            }         

            writer.close(); // Save all data and close writer

            // Read and display all file contents
            FileReader reader = new FileReader(file);
            int ch;
            while ((ch = reader.read()) != -1 ){  // Read character by character
                System.out.print((char) ch);       // Print actual character
            }
            reader.close(); // Close reader
            sc.close();     // Close Scanner

        } catch (IOException e) {
            // Handle file I/O errors
            System.err.println("File Handling Error");
            e.printStackTrace();
        }
    }
    
}

import java.io.File;          // To create and manipulate files
import java.io.FileReader;    // To read characters from files
import java.io.FileWriter;    // To write characters to files
import java.io.IOException;   // To handle input/output exceptions
import java.util.Scanner;     // To read user input

public class FileHandling {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input from user

        try {
            File file = new File("student.txt"); // Create File object (does not create physical file yet)

            // Create the file physically if it does not exist
            if (file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }

            // Take student details as input
            System.out.println("Enter student name ");
            String name = sc.nextLine();   // Reads full line including spaces
            System.out.println("Enter student roll no. ");
            int rollno = sc.nextInt();     // Reads integer value

            // FileWriter in append mode to avoid overwriting existing data
            FileWriter writer = new FileWriter(file,true);
            writer.write(rollno + "," + name + "\n"); // Write data as "rollno,name" with newline
            writer.close(); // Always close writer to save data

            // Read the file character by character
            FileReader reader = new FileReader(file);
            int ch;
            while ((ch = reader.read()) != -1){  // read() returns -1 at EOF
                System.out.print((char) ch);     // Cast int to char to print actual character
            }
            reader.close(); // Close reader
            sc.close();     // Close Scanner to free resources

        } catch (IOException e) {
            // Handles errors such as file not found or unable to write
            System.err.println("File handling error");
            e.printStackTrace();
        }
    }
    
}

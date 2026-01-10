public class PrameterizedMethods {
    static void display (String name){
        System.out.println("Displaying name :"+name);
    }// this is a single parameterized method

    static void display(String name ,String lastName){
        System.out.println("Displaying full name :"+name+" "+lastName);
    }// this method has two prameter it also act as method overload which mean that same method name and different parameter

    public static void main(String[] args) {
        display("Kabeer");// This call the frist method
        display("Kabeer","Sable");// This call the second method

    }
    
}
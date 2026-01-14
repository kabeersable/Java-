class Person{
    protected String name;

    public Person(String name){
        this.name =  name;
    }

    public void display(){
        System.out.println("Teacher name:" +name);
    }
   
}

class Teacher extends Person{
    private String subject; 

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Subject: " +subject);
    }

     public class Department{ /* why inner class access outer class member ?
        Inner class has an implicit reference to outer class
    This is HAS-A, not IS-A*/ 
       public String departmentName ;

       public Department(String departmentName){
        this.departmentName = departmentName;
        System.out.println("Department name: " +departmentName + " Teacher: " +name);
       }
    }

}
public class Super_InnerClassP {

    public static void main (String [] args){
        
       
        Teacher teacher = new Teacher("Ankita", "Java");
           
        teacher.display();

        Teacher.Department department = teacher.new Department("Computer");

    }
    
}

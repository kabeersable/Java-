class Employee{
    protected int salary;

    public Employee( int salary){
        this.salary= salary;
    }

 
    public void displaySalary(){
        System.out.println(" Salary: "+salary);
    }
}

class Manager extends Employee{
    private int bonus ;  
    public  Manager( int salary,int bonus){
        super(salary);
        this.bonus = bonus;
     }
     @Override
    public void displaySalary(){
        System.out.println("Base Salary"+super.salary);
        System.out.println("Bonus:"+bonus);
        System.out.println("Total Salary:"+(salary+bonus));
    }
    
    class Department{
        public String departmentName;

        public void displayDetails(){
            System.out.println("Department:"+departmentName);
            System.out.println("Manager Salary:"+salary);
        }

        public String getDepartment(){
            return departmentName;
        }

        public void setDepartment(String departmentName){
            this.departmentName = departmentName;
        }


    }
}
public class SuperAndInnerClass {

    public static void main (String [] args){
 
    
    Manager manager = new Manager(50000,10000);
    Manager.Department department = manager.new Department();   


    manager.displaySalary();
    department.setDepartment("Computer");
    department.displayDetails();

    
    }

   
    
}

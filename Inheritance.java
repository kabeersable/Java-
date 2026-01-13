
class SuperClass {
    private int a =8;
    public int b = 10;
    protected int c = 20;

    void display(){
        System.out.println("only private member can be access a :"+a);
    }

    public int geta (){
        return a; 
    }
}

class SubClass extends SuperClass{

    void display(){
        System.out.println("Accessing Private member  in subclass using getter method a :"+geta());
        System.out.println("we can access public member in subclass b : "+b);
        System.out.println("Access protected member of class c:" +c);
    }

}

// final class cannot be inherited 


public class Inheritance {

   public static void main(String[] args) {
    SuperClass Sc = new SuperClass();
    SubClass sc = new SubClass();

    Sc.display();
    sc.display();
       
    }
}




    






class Animal{
    // performing overloading 
    private String name;// Encapsulation of name variable

    public void display(){ // same name but diffirent parameter
        System.out.println("I am the Chef of animal");
    }

    public void display(String name){// this have same name but diffirent parameter 
        System.out.println("Call :"+name);

    }
    public String getName(){ // demonstrating setter 
        return name;

    }

    public void setName(String name){ // demonstrating getter 
       this.name= name;
    }
    
}
// performing method overridig
class Dog extends Animal{
    public void display(){
        System.out.println("Hi, I am " +getName()+ ", and I am a dog");

    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("Hi, I am " +getName()+ ", and I am a cat");
    }

}


public class Polymorphism {

    public static void main (String []args){

    Animal animal = new Animal();
    Animal dog = new Dog();
    Animal cat = new Cat();
    
    animal.display();
    animal.display("Mike");
    dog.setName("Mike");
    dog.display();
    animal.display("Luna");
    cat.setName("Luna");
    cat.display();

    }
    

    
}

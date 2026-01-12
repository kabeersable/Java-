public class ClassAndObject {
    int a = 20;
    String name = "kabeer";

    public  ClassAndObject (){
        System.out.println("Inside the Constructor"); // gets execute when object instance is created

    }
    /*@Override
    public String toString(){
        return("object of a = "+a +"\sand name = "+name); // this function overrides toString function that java implicitlly use during sopln("object"+o); 
        // if not done it shows hashcode(uniquely identify object) of object unique identifier by JVM java virtual machine 
    }*/

    public ClassAndObject(int x){
        this.a = x;//  refer a = x 
        System.out.println(x);
    }
    public ClassAndObject(int a , String name){
        this.a= a;
        this.name = name;
        System.out.println(a +" "+name);
    }
    public static void main(String[] args) {
        ClassAndObject o = new ClassAndObject();
        System.out.println("object"+o);
        System.out.println("calling varible a using object"+o.a); // basic calling using object

        new ClassAndObject(4);
        new ClassAndObject( 5, "Rohan");

    }
}

public class Variables{
    public static void main(String[] args){
        // Variable declaration and initialization
        int number = 20;
        String message = "Hello World";
        float decimalvalue = 10.5f;
        char character = 'A';
        boolean isJavaFun = true;

        // multiple varivale declaration

        int a = 5 , b = 10 , c = 15 ;

        // final variable can not be changed 
        final int constantValue = 100;

        // printing variables
        System.out.println("this is integer:" +number);
        System.out.println("this is String:" +message);
        System.out.println("this is float:" +decimalvalue);
        System.out.println("this is char:" +character);
        System.out.println("this is booleen values isJavaFun:" +isJavaFun);

        // printing multiple variable 
        System.out.println("Addition of a,b,c is:" +(a+b+c));   

        

    }
}
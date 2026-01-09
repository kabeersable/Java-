package Java;

import java.net.SocketImpl;

public class TypeCastAndOperators {

    public static void main(String [] args)
    {
        double num = 20.87d;
        int convertednum = (int) num ; // type casting from double to int 

        System.out.println( "use of type cast manually from double to int (explicit)"+convertednum);

        // Oparators in Java 

        int a = 10 , b = 5;

        // Arithmetic Operators 
        System.out.println("Addition of a and b is "+ (a+b)); // Addition 
        System.out.println("Substration of a and b is "+(a-b));
        System.out.println("Multiplication of a and b is "+(a*b));
        System.out.println("Division of a and b is "+(a/b));
        System.out.println("Modulus of a and b is " +(a%b));
        System.out.println("Increment of a is "+(++a) ); // Increment 
        System.out.println("Decrement of b is "+(--b)); // Decrament 

        //Relational Operators 

        System.out.println(" Is a equal to b :"+(a==b));
        System.out.println("Is a not eaqual to b :"+(a!=b));
        System.out.println("Is a Grater than b :"+(a>b));
        System.out.println("Is a less than b : "+ (a<b));
        System.out.println("Is a greater than or equal to b :"+(a>=b));
        System.out.println("Is a less than or equal to b :"+(a<=b));

        // Logical Operations

        System.out.println("Logical AND operation :" +((a>b)&&(a==b)));
        System.out.println("Logical OR operation :" +((a>b)||(a==b)));
        System.out.println("Logical NOT operation :"+(!(a>b)&&(a==b)));

        // Precedence 
        // The operation done as per the order like BODMAS 
        /* Following is the priority of the operation 
                () = parentheses
                 *,/,% = Multiplicatio , Division , Modulus 
                 +,- = Addition , Subtration 
                 >,<,=,>=,<= = Logical or Comparision (one and the same)
                 ==,!= = Equality 
                 && = Logiacal AND
                 || = Logiacal OR
                 = = Assignment 
         */
        System.out.println(" Precedence : " + 2*4+(9/3)); // should come to be 11 

    }
    
    
}

public class Recursion {
    
    // basic recursion 

   public static int multiple (int n){
        if (n > 1){
             System.out.println("n = "+n);
            return n * multiple(n-1);
           
        }
        else{
            System.out.println(" in else statment");
            return 1 ; // if 0 * any number is 0 so is are stoping condition 
        }

    }

    // addition of numbers 
    public static int sum (int k){
        if (k > 0)
        {
            System.out.println("value of k "+k);// to understand what is value of k
            return k + sum(k-1);
        }
        else{
            return 0;
        }

    }

    public static int Factorial(int f){
        if(f > 1){
            System.out.println("value of f "+f);
            return f *Factorial(f-1); 
           }
           else{
            return 1 ;
           }
        }



    public static void main (String [] args){
         int result = multiple(5);
         System.out.println(" value of multiplication :"+result+"\n");

         result = sum(6);
         System.out.println("sum value :"+result+"\n");

         result = Factorial(8);
         System.out.println("Result of Fibonacci :"+result+"\n");
    }
}

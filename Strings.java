
public class Strings {
    public static void main (String [] args)
    {
        // Carrying out Funtion/Methods of String Class
        
        String name = "Prasenjeet";
        String statement = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        System.out.println("To upper case :" + name.toUpperCase()); // convert to upper case 
        System.out.println("to lower case :"+ name.toLowerCase());  // convert to lower case 
        System.out.println("index of amet in statement :"+ statement.indexOf("amet"));  // find first occurance of the specific word (position with whitespace)
        System.out.println("chart at 6 palce in name :"+name.charAt(6)); // shows char at that index
        System.out.println("are this to string equal to :"+ name.equals(statement)); // shows if two string are equal or not 
        System.out.println("removing whitespace for statment"+statement.trim()); // removes whitespace for the string

        // Concatination of two String 
        // we can concat using "+" or "concat" note that "+" is use to concat and also to add number 

        String lastName = "Ambhore";

        System.out.println("using \"+\" to concat two String :"+ name+" "+lastName); // but this way we can add whitespace between them
        System.out.println("using concat() to concat two String :"+name.concat(" "+lastName));// this also doesn`t change any thing output is same as before 
        // both act as same while printing but thier will be no whitespace 

        /* Special Symbol to print in  line while sopln
            \" \" - use to print "" in while printing line 
            \n - use to print on new line 
            \t - use to add tab in printing line 
            \\ - use to add backslach in printing line 
        */
    }    
}

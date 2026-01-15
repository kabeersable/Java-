interface Shape{ 
    /* this is a interface for shape which will find the area of the shape 
     this use the method area() */
    final double pie = 3.14159;
    public abstract void area( int l ,int w);
    
}

interface Notification{
    /* this is the real world problem to send msg using email or sms
    this uses the abstrat method send(msg) */
    public abstract void send(String msg);
}
public class PraticesInterface {

   public static void main (String[] args){
    Shape rectangle = new Shape() {
        @Override
        public void area(int l, int w){
            System.out.println(" area of rectangle is "+(l * w));
        }
    };
    

    Notification email = new Notification() {
         @Override
         public void send(String msg){
            System.out.println("this is send using email "+msg);
         }
    };
    Notification sms = new Notification() {
        @Override
        public void send(String msg){
            System.out.println("This msg is send using sms"+msg);
        }
    };

    rectangle.area(6 , 9);
    email.send("hello how are you");
    sms.send("nice to me you");

   }

    
}

interface Payment{

     public abstract void payAmount (double amount);
     
}


public class InterfaceAndAnonymous {

    public static void main (String [] args){
        Payment creditcardpayment = new Payment() {
            @Override
            public void payAmount(double amount){
                System.out.println("Your payment amount is:" +amount +"using Credit card");

            }
           
        };

        Payment upipayment = new Payment() {
            @Override
            public void payAmount(double amount){
                System.out.println("Your amount to pay is:" +amount +"using UPI payment");
            }
        };

        creditcardpayment.payAmount(5000);
        upipayment.payAmount(3000);
    }
    
}

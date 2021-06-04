public class ForLoop {

    public static double calculateInterest(double amount , double interestRate){
        return (amount*interestRate/100);
    }

    public static void main(String[] args){
        //For loop Syntax
        //for (init;termination;increment){
        //}

        //for loop for calculate interest
        for (int i=1;i<=8;i++){
            System.out.println("10000 at "+i+"% Interest is " +String.format("%.2f",calculateInterest(10000,i)));
        }
            System.out.println("******************************");
        //Reverse loop
        for (int i=8;i>=1;i--){
            System.out.println("10000 at "+i+"% Interest is " +String.format("%.2f",calculateInterest(10000,i)));
        }
    }
}

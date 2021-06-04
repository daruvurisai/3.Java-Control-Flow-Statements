public class PrimeNumberCount {
    //Function to check whether a number is prime or not
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int count =0;
        for (int i=0;i<30;i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a Prime Number");
                if (count==10){
                    System.out.println("Exiting For loop");
                    break;
                }
            }

        }
    }
}

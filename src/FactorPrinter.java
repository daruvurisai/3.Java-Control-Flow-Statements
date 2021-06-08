public class FactorPrinter {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        else {
            for(int i = number;i>0;i--){
                int factor= number/i;
                if(number%i==0){
                    System.out.println(factor);
                }
            }
        }
    }

    public static void main(String[] args){
        printFactors(3);
    }

}

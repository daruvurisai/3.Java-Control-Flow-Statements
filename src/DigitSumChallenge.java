public class DigitSumChallenge {
    public static int sumDigits(int number){
        if(number>=10){
            int sum=0;
            //125-->125/10-->12*10=120-->125-120=5
            while (number>0){
                //Extract a least significant digit
                int digit = number%10;
                sum+=digit;//sum =sum+digit

                //Drop the least significant digit

                number/=10;//number=number/10

            }
            return sum;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println(sumDigits(125));

    }
}

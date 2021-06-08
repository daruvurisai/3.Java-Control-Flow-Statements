

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int lastDigit = 0;
            int evenDigitSum = 0;//Declare variables

            //while loop
            while (number != 0) {
                //find the last Digit
                lastDigit = number % 10;
                //Check whether lastDigit is even or not
                if (lastDigit % 2 == 0) {
                    //Add It to evenDigitSum
                    evenDigitSum += lastDigit;
                }
                //remove last digit of the number
                number = number / 10;
            }
            return evenDigitSum;

        } else {
            return -1;
        }
    }



    public static void main(String[] args){
        System.out.println(getEvenDigitSum(1234));
    }
}

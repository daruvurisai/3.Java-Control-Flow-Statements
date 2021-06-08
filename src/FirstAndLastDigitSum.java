public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;

        } else {
            int originalNumber = number;
            //Extracting the last digit of a number
            int lastDigit = number % 10;
            //First digit is initialized as equal to 0
            int firstDigit = 0;
            //While loop finds the first digit and assigns that to the variable First Digit
            //or assigns the value of lastDigit to firstDigit when the number has only one digit
            if (number < 10) {
                firstDigit = lastDigit;
            } else {
                while (number > 1) {
                    number = number / 10;
                    if (number == 0) {
                        break;
                    }
                    firstDigit = number;
                }
            }
            return firstDigit + lastDigit;

        }

    }



    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(252));

    }

}

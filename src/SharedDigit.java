public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int number1LastDigit = number1 % 10;
            int number2LastDigit = number2 % 10;

            number1 /= 10;
            number2 /= 10;
            int number1FirstDigit = number1;
            int number2FirstDigit = number2;
            return ((number1FirstDigit == number2FirstDigit) || (number1FirstDigit == number2LastDigit) || (number1LastDigit == number2FirstDigit) || (number1LastDigit == number2LastDigit));

        } else {
            return false;
        }
    }


    public static void main(String[] args){

        System.out.println(hasSharedDigit(12,32));
    }
}

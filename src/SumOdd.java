public class SumOdd {
    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {

            return true;
        } else {

            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
    public static void main(String[] args){
        isOdd(7);
        isOdd(9);
        System.out.println(isOdd(7));
        sumOdd(100,100);
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(10,5));
    }

}

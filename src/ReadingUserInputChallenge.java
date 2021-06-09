import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter =0;
        int sum = 0;
        while (counter<10){
            int order = counter+1;
            System.out.println("Enter Number # " +order+" : " );

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum+=number;

            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();//Handle end of line (Enter Key)
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}

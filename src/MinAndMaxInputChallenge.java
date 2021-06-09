import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args){
        //Declare Scanner object
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean first = true;
        while (true){
            System.out.println("Enter Number ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
               // if(first){
                 //   first=false;
                //    min=number;
              //      max=number;
              //  }
                if(number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }
            else {
               break;
            }
            scanner.nextLine();//Handle Input
        }
        System.out.println("Min = "+min+", Max = " +max);
       scanner.close();
    }
}

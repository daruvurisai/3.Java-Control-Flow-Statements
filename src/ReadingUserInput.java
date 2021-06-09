import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Your Date of birth Year : ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int YearOfBirth = scanner.nextInt();
            scanner.nextLine();//handle next line character (Enter Key)

            System.out.println("Enter Your Name");
            String name = scanner.nextLine();

            int age = 2021-YearOfBirth;

            if(age>=0&&age<=100){
                System.out.println("Your Name is " +name+ " , and You are "+age+" Years Old.");
            }else {
                System.out.println("Invalid Year of Birth");
            }

        }
        else {
            System.out.println("Unable to pass year of Birth.");
        }

        scanner.close();

    }
}

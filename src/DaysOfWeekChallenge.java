public class DaysOfWeekChallenge {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.printf("Its Monday");
                break;
            case 1:
                System.out.printf("Its Tuesday");
                break;
            case 2:
                System.out.printf("Its Wednesday");
                break;
            case 3:
                System.out.printf("Its Thursday");
                break;
            case 4:
                System.out.println("Its Friday");
                break;
            case 5:
                System.out.printf("Its Saturday");
                break;
            case 6:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.printf("Invalid Day");
                break;
        }
    }
    public static void main(String[] args){
        printDayOfTheWeek(3);
    }
}

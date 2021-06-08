public class Challenge {
    public static boolean isEvenNumber(int number){
        if ((number%2)==0){
            return true;

        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isEvenNumber(2));
        int number =4;
        int finish_number =12;
        int evenNumberCount = 0;

        while (number<=finish_number){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            else{
                evenNumberCount++;
                System.out.println("Even Number " +number );
            }
            System.out.println("Total Number of Even Numbers Found are "+evenNumberCount);
        }
    }
}

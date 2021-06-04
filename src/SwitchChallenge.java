public class SwitchChallenge {
    //Create a new switch statement using char instead of int
    //create a new char variable
    //create a switch statement testing for
    //A,b,c,d or e
    //display a message if any of these are found and then break
    //add a default which displays a message saying not found

    public static void main(String[] args){
        char c = 'a';
        switch (c){
            case 'a':
                System.out.printf("Its A");
                break;
            case 'b':
                System.out.printf("Its B");
                break;
            case 'c': case 'd': case 'e':
                System.out.printf("Its "+c);
                break;
            default:
                System.out.printf("Its None");

        }
    }

}

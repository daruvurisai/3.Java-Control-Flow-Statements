public class SwitchClass {
    //Switch statement
    public static void main(String[] args){
        int switchValue=5;
        switch(switchValue){
            case 1:
               System.out.println("Value was 1");
               break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5 ");
                System.out.println("It was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
         }
        //More code here
    }
}

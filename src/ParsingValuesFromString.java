public class ParsingValuesFromString {

    public static void main(String[] args){
        String numberAsaString="2018";
        System.out.println("NUmber as a String " +numberAsaString);
        //Converting String to a various primitive type

        int number = Integer.parseInt(numberAsaString);
        //Integer is a wrapper class which has some useful static methods
        System.out.println(number);

        numberAsaString+=1;
        number+=1;
        System.out.println(numberAsaString);
        System.out.println(number);

    }
}

package myArray;

public class FunTimeWork {
    public static void main(String[] args) {
        String[] sportsNames = {"cricket","rugby","football", "basket ball","tennis"};
        int myArraylength = sportsNames.length;
        System.out.println("my array length is :" + "  " + myArraylength);
        // using for each loop
        for (String sportsName:sportsNames){
            System.out.println(sportsName);


            
        }

    }
}

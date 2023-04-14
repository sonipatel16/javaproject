package exceptionConcept;

public class HomeWorkLec13a {
    public static void main(String[] args) {
        char[] vowels= {'a','e','i','o','u'};
     // array index     0   1   2   3   4
        try {
            System.out.println(vowels[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("it's not possible to get the index at 5");


        }finally {
            System.out.println("problem not solve");
        }








    }
}

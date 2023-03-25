package myArray;

public class CreateLogic {
    public static void main(String[] args) {
     int  change = 0;
     float convert = 8.78f;       // narrow casting
     change = (int)convert;
       System.out.println(change);
       convert = (float)change;     // widening casting
       System.out.println(convert);
       char[] myAlphabets={'a','b','c','d','e','f','g'};
       int myArrayength = myAlphabets.length;
        System.out.println("array length is :" + "  "+ myArrayength);
        for (int c=0;c<myAlphabets.length;c++);{
            System.out.println(myAlphabets);{
                for (char myAlphabet:myAlphabets){
                    System.out.println(myAlphabet);

                    
                }
            
                
            }

        }




    }
}

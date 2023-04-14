package collectionConcept;

import java.util.ArrayList;
import java.util.Collections;

public class GoodWork4 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(25);
        myNumbers.add(27);
        myNumbers.add(35);
        myNumbers.add(45);
        int min = myNumbers.get(0);
        int max = myNumbers.get(0);
        // store the arraylist length
        int x = myNumbers.size();
        // loop to find small number
        for (int i = 1; i < x; i++) {
            if (myNumbers.get(i) < min) {
                min = myNumbers.get(i);
            }
        }// loop to find large  number
        for (int i = 1; i < x; i++) {
            if (myNumbers.get(i) > max) {
                max = myNumbers.get(i);



            }
        }
        System.out.println("small number is:" +" " + " " + min);
        System.out.println("larger number is :" +  "  " + "  " + max) ;

    }
}
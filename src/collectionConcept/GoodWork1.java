package collectionConcept;

import java.sql.Array;
import java.util.ArrayList;

public class GoodWork1 {
    public static void main(String[] args) {
        int[] numbers = { 98,  54 ,53, 34, 23 };
        int s = numbers[0];
        int l = numbers[0];
        for (int i =1 ;i<numbers.length;i++){
            if(numbers[i] > l)l = numbers[i];
            else if (numbers[i]<s)s= numbers[i] ;{
                
            }
        }
        System.out.println("large number is :" + l);
        System.out.println("small number is :"  + s);

       // ArrayList<Integer> numbers = new ArrayList<Integer>();




    }
}

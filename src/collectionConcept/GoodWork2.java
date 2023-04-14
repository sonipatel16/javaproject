package collectionConcept;

import java.util.HashSet;

public class GoodWork2 {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();
        values.add(40);
        values.add(50);
        values.add(70);
        values.add(45);
        values.add(40);
       // values.remove(50);

        for (int i:values
             ) {
            System.out.println(i);

        }


    }
}

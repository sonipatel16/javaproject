package myArray;

public class HappyTime {
    public static void main(String[] args) {
        int[]arry= {678,987,456,654,345,543};
        // index     0   1   2   3   4   5
        System.out.println(arry[2]);
        arry[0]=578;
        arry[1]= arry[0] + arry[3];
        arry[2]= arry[1]  - arry[4];
        arry[3]= arry[2] * arry[0];
        arry[4] = arry[5]/ arry[3];
        System.out.println(arry[0]);
        System.out.println(arry[1]);
        System.out.println(arry[2]);
        System.out.println(arry[3]);
        System.out.println(arry[4]);
        if (arry[1]>arry[0]){
            System.out.println(" 1 is bigger");
        } else if (arry[3]>arry[1]) {
            System.out.println(" 3 is bigger");


        }else {
            System.out.println("one is bigger");
        }

    }






    }




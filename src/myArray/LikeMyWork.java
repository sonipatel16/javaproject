package myArray;

public class LikeMyWork {
    public static void main(String[] args) {
        String[] arrColours = {"RED", "PINK", "BLUE", "BLACK", "WHITE"};
        //INDEX                  0      1     2        3       4
       int myArraylength = arrColours.length;
        System.out.println("my Array length is " + "  " + myArraylength);
        for (int a = 0; a < myArraylength; a++) {
            System.out.println(arrColours[a]);

        }for (int a= myArraylength-1;a>=0;a--){
            System.out.println(arrColours[a]);


            int[] arr ={678,567,60,70,80,40,50};
            int sum = 0;

            for (int x:arr){
                sum = sum + x;
                System.out.println(sum);
                
            }
        }

    }
}
package myArray;

public class WorkHard {
    // finding smallest and largest number
    public static void main(String[] args) {
        int numbers [] = {789,190,-90,7807,456,-89,76543};
        int smallest =numbers[0];
        int largest = numbers[0];
        int myArraylength= numbers.length;
        System.out.println("my array length is " + "  " +myArraylength);
        for (int a =1; a<numbers.length; a++){
            if(numbers[a]>largest){
                largest=numbers[a]; //76543
            } else if (numbers[a]<smallest) {
                smallest = numbers[a]; // -90

            }
        }
        System.out.println("largest number is :" + largest );
        System.out.println("smallest number is :" + smallest);


    }
}

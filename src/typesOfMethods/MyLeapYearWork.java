package typesOfMethods;

public class MyLeapYearWork {
    public static void main(String[] args) {
        int year = 2020;
        /* a leap year divided by 4 & 400
        but not divided by 100
         */
        if (((year %  4 == 0) || (year % 100 != 0)) && (year % 400 == 0)) {
            System.out.println("Leap Year");

        }else {
            System.out.println("Normal Year");
        }
    }
}


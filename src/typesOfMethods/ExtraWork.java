package typesOfMethods;

public class ExtraWork {
    // a leap year divided by 4 & 400 but not by 100 //
    public static boolean aboutLeapYear(int year){
        if (year % 4 == 0){
            return true;

    } else if (year % 400 != 0) {
            return false;
        } else if (year % 100 ==0) {
            return false;
            
        }else {
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(aboutLeapYear(2016));
        System.out.println(aboutLeapYear(2022));

    }
    }

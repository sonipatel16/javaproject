package typesOfMethods;

public class SwitchClassWeek {
    public static void weekDaysCounting(int weekDaysNumber){


        switch (weekDaysNumber){
            //monday
            case 1:
                System.out.println("  monday  " + "   hectic day of the week ");

                //tuesday
            case 2:
            System.out.println("tuesday");
            break; // wednesday
            case 3:
            System.out.println("wednesday");
            break; // thursday
            case 4 :
                System.out.println("thursday");
                break; // friday
            case 5:
                System.out.println("friday");
              break;   // saturday
            case 6 :
                System.out.println("saturday  " + "  busiest day");
                 // sunday
            case 7:
                System.out.println(" sunday " +  "   relaxing day  ");
               break;  // default
            default:
                System.out.println("invalid day");
        }

    }

    public static void main(String[] args) {


        weekDaysCounting(6);
    }

}

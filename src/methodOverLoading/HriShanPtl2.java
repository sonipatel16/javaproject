package methodOverLoading;

public class HriShanPtl2 {
    public static void myGymActivities(String workout) {
        System.out.println("i start my workout after warmup step");


    }
    public static void myGymActivities(String workout1,String workout2){
        System.out.println("i start my exercise after " + workout1 );
        System.out.println("than i start another session after" + workout2);

    }
    public static void myGymActivities (String pushUps,String Zumba,String aerobics){
        System.out.println("after the step 1 & step 2 i start my favourite exercise which is " + Zumba );
        System.out.println("after the step 1 & step 2 i start my favourite exercise which is " + aerobics);
        System.out.println("after the step 1 & step 2 i start my favourite exercise which is " + pushUps);
    }

    public static void main(String[] args) {
        myGymActivities("running");
        myGymActivities("cycling","jumping");
        myGymActivities("pushUps","Zumba","aerobics");
    }
    }





package typesOfMethods;

//simple method// no return ,no parameter

public class SimpleMethodClass {
    public void mySonFavouriteSport(){
        String mySonFavouriteSport= "rugby";
        System.out.println(mySonFavouriteSport);
    }public static void workingInHospital(){
        String workingInHospital ="as a phlebotomist";
        System.out.println(workingInHospital);

    }

    public static void main(String[] args) {
        workingInHospital();
        SimpleMethodClass myObject = new SimpleMethodClass();
        myObject.mySonFavouriteSport();
    }
}


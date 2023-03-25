package typesOfMethods;

public class ParaMetrisedMethod {
    // non static

    public void myBiodata(int age,int waist,int height){
        System.out.println(age+waist+height);
    }
    public static void partyPreparation(String guestlist){
        System.out.println(guestlist);

    }public static void totalExpense(int bill){
        System.out.println(bill);
    }

    public static void main(String[] args) {
        String guestlist = "fiftypeople";// say yes to come to the party
        System.out.println(guestlist+" "+"say yes to come to the party.");
        partyPreparation(guestlist);
        int bill = 3500;
        System.out.println(bill);
        ParaMetrisedMethod myObject = new ParaMetrisedMethod();
        System.out.println(guestlist);
        myObject .myBiodata(35,30,5);


    }
}

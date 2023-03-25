package inheritenceClassWork;
// multilevel inheritance
public class SilverClassB extends DiamondClassA{
    String girlName = "meera";
    String boyName = " nand";
    public  void selectNames(){
        System.out.println(" which name you like ");
    }

    public static void main(String[] args) {

        SilverClassB silverClassB = new SilverClassB();
        System.out.println(silverClassB.c);
        System.out.println(silverClassB.boyName);
        System.out.println(silverClassB.girlName);
        silverClassB.selectNames();
        silverClassB.addNumbers();



    }

}

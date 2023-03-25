package inheritenceClassWork;
// extends SilverClassB & DiamondClassA
public class CopperClassC extends SilverClassB{
    char sign = 'f';
    char out = 'l';
    public void logInDetails(){
        System.out.println("please check my data");
    }

    public static void main(String[] args) {
        CopperClassC copperClass = new CopperClassC();
        System.out.println(copperClass.sign);
        System.out.println(copperClass.out);
        copperClass.logInDetails();
        copperClass.selectNames();
        System.out.println(copperClass.boyName);
        System.out.println(copperClass.girlName);
        copperClass.addNumbers();
        System.out.println(copperClass.c);
    }
}

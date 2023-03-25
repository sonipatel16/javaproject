package inheritenceClassWork;
// single inheritance examples
public class myPlatinumTop  extends DiamondClassA{
  static  byte d = 45;   // Heirarchical
    public static  void myBangles(){
        System.out.println("i love my platinum bangles");
    }

    public static void main(String[] args) {
        myPlatinumTop myPlatinumTop = new myPlatinumTop();
        System.out.println(myPlatinumTop.c);
        myPlatinumTop.addNumbers();
        myBangles();
        System.out.println(myPlatinumTop.d);




    }
}

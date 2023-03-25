package inheritenceClassWork;

public class likeGoldRing extends DiamondClassA{
    int x =500;     // heirarichical
    public  void myGoldPrice(){
        System.out.println("gold is very expensive");
    }
    public static void main(String[] args) {
likeGoldRing likeGoldRing = new likeGoldRing();
        System.out.println(likeGoldRing.x);
        System.out.println(likeGoldRing.c);
        likeGoldRing.myGoldPrice();
        likeGoldRing.addNumbers();







    }


}

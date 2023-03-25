package inheritenceClassWork;
// multilevel inheritance

public class DiamondClassA {
    int a =35;
    int b = 45;
    int c = a+b;
    public  void addNumbers(){
        System.out.println(" give me total of this numbers");
    }

    public static void main(String[] args) {
        DiamondClassA diamondClass = new DiamondClassA();
        System.out.println(diamondClass.c);
    }
}

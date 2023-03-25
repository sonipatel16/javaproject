package multipleInheritanceConcept;

public class KidB2 implements Parent2 {
    @Override
    public void division() {
        int a= 10;
        int b = 5;
        System.out.println(a/b);


    }

    @Override
    public void hobby() {
        String book = "reading";
        System.out.println(book);

    }

    @Override
    public void myHome() {
        byte number = 17;

    }

    @Override
    public void fun() {
        String like = "be with friends";
        System.out.println(like);

    }

    public static void main(String[] args) {
        KidB2 kidB2 = new KidB2();
        kidB2.division();
        kidB2.fun();
        kidB2.hobby();
        kidB2.myHome();
    }
}

package MyModifieresClass;
// private access
public class Modifiers2 {
    private String hobby ="reading";
    private static int z=675;

    public static void main(String[] args) {
        Modifiers2 myObject = new Modifiers2();
        System.out.println(myObject.hobby);
        System.out.println(Modifiers2.z);
    }

    }




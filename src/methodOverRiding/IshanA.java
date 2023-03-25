package methodOverRiding;

public class IshanA extends KetanC {
    public static void loveCooking(String dish,String variety){
        System.out.println("ishan  like  baking " +   dish);
    }
    public static void loveCooking(String pasta,String pizza,String bhurji ){
        System.out.println("he like white sauce creamy " +   pasta);
        System.out.println("ishan wants pizza loaded with cheese  "  +   pizza);
        System.out.println("ishan like to cook egg " +   bhurji);

    }

    public static void main(String[] args) {
        loveCooking("cookie","of cakes");
        loveCooking("macroni","with veges","crumble");

    }

}

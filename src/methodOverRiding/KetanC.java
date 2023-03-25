package methodOverRiding;

public class KetanC {
    public static void loveCooking(String dish,String variety){
        System.out.println("ketan love to cook varieties of food " + dish);
        System.out.println("he like to try inovetive " + variety);


    }
    public static void loveCooking(String pasta,String pizza,String bhurji){

    }

    public static void main(String[] args) {
        loveCooking("dishes","cuisine");
        loveCooking("red","italian","Paneer");
    }
}

package multipleInheritanceConcept;

public class KidA1 implements GrantParent1{
   public void sports(){
       String names = "football,rugby,tennis, basketball";
       System.out.println("i love to play different sports "  +  "   " + " , "  +  names);

    }
   public void games(){
       String indoor = " cards, chess, puzzles";
       System.out.println(" we start our indoor game when its rainy " +  "  "   + " ,  " +   indoor);

    }
   public void cricket(){
       int players = 11;
       System.out.println(" eagerly waiting for cricket match "   +  "   "  + players);

    }

    public static void main(String[] args) {
       KidA1 kidA1 = new KidA1();
       kidA1.cricket();
       kidA1.sports();
       kidA1.games();

    }


}

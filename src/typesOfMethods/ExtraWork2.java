package typesOfMethods;

public class ExtraWork2 {
    public static void main(String[] args) {
        String game1 = "Cricket"; // outdoor game
        String game2 = "Cards game"; // indoor game
        switch (game1){
            case "Football":
                System.out.println("Ishan favourite game");
                break;
            case "Cricket":
                System.out.println("Evey Indians love this game");
                break;
            case "Rugby":
                System.out.println("Hrishi love this game");
            default:
                System.out.println("Outdoor games");
                switch (game2){
                    case "Chess":
                        System.out.println(" let's play this game");
                        break;

                    case "puzzles":
                        System.out.println("boring game");
                    default:
                        System.out.println("no games to play");
                }
        }
    }
}

package typesOfMethods;

import java.util.Locale;

public class StringMethodWork {
    public static void main(String[] args) {
        String paris = "effile tower";
        String cricket= "Virat kohli";
        String question = "what is your strength";
        String admission = "school and collage";
        System.out.println(paris.length());
        System.out.println(cricket.toLowerCase());
        System.out.println(paris.toUpperCase(Locale.ROOT));
        System.out.println(cricket.contains(paris));
        System.out.println(question.replace("your","my"));






    }
}

package noneAccessModifiers;
// adding number 1 to 50
public class AddingNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for ( int a=1; a<=50;a++){
            sum= sum + a;

            System.out.println(sum);
        }
    }
}

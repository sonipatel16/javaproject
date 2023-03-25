package noneAccessModifiers;

public class StaticClass {
    public static void rootClass(){
        for (int b=1;b<=20;b++){
            int c= b*b;
            System.out.println("square of number" + "  " + b + "  " + " = " + " " + c);
        }
    }

    public static void main(String[] args) {
        rootClass();
    }
}

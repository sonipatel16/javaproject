package typesOfMethods;

public class IfElseUseInMaximumNumber {
    public static void checkMaximumNumber(int a,int b,int c) {
        if (a>b && a>c){
            System.out.println(a + "is bigger number");
            
        } else if (b>a && b>c ) {
            System.out.println(b +"is bigger number");
            
        }else {
            System.out.println(c +"is bigger number");
        }

    }

    public static void main(String[] args) {
        checkMaximumNumber(567,678,789);
        checkMaximumNumber(8796,6785,9876);

    }
}

package exceptionConcept;

public class HomeWorkLec13 {
    // this programs divide by o which create arithmetic exception
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {


            int c = a / b;// it's error here can't divide by 0
            System.out.println("a divide by b is :" + c);
        } catch (ArithmeticException e) {
            System.out.println(" so you can not divide by 0");

        }finally {
            System.out.println("that's get an error");
        }
    }
}
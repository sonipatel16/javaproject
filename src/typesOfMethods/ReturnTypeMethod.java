package typesOfMethods;

// return type method
public class ReturnTypeMethod {

    public static int multiplyThreeDigit(){
        int a = 45;
        int b= 350;
        int c = (a*b);
        System.out.println(c);
        return c;


    }public String myDreamJob(){
        String job = "tester";
        System.out.println(job);
        return job;



    }

    public static void main(String[] args) {
        multiplyThreeDigit();
        ReturnTypeMethod myObject = new ReturnTypeMethod();
        System.out.println(ReturnTypeMethod.multiplyThreeDigit());
        System.out.println(myObject.myDreamJob());
    }
}


















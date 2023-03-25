package methodOverLoading;

public class HriShanPtl1 {
    public static void multiplication(){
        int a= 455;
        int b= 556;
        int c= (a*b);
        System.out.println(c);
    }
    public static void multiplication(int a,int b ){
        System.out.println(a*b);
    }
    public static void multiplication(int c,int d, int e){
        System.out.println(c*d*e);
    }
    public static void multiplication(char first,char second,char third,char fourth){
        System.out.println("print my name alphabets:      "+    'f'   +  'a'   +  'l'  +   'g' );
    }

    public static void main(String[] args) {
        multiplication();
        multiplication(10,20);
        multiplication(45,55,78);
        multiplication('f','a','l','g');

    }
}

package methodOverRiding;

public class HrishiB extends KetSoniD {
    public static void mySubtraction(float a,float b){
        float f = a-b;
        System.out.println(f);
    }
    public static void mySubtraction(int c,int d,int e, int h){
        int k = c-d-e-h;
        System.out.println(k);
    }
    public static void mySubtraction( char x,char y,  char z,char w){
        char alphabets;
        x=2;
        y=4;
        z=8;
        w=1;
        System.out.println("i needs to print this numbers for my alphabets : "    +    '2'      +  '4'   +    '8'    +    '1');

    }

    public static void main(String[] args) {
        mySubtraction(10.8f,3.45f);
        mySubtraction(32,45,54,78);
        mySubtraction('2','4','8','1');


    }

}

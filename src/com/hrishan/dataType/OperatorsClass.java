package com.hrishan.dataType;

public class OperatorsClass {
    public static void main(String[] args) {
        //arithmetic
        byte a=10;
        byte b=20;
        System.out.println(a+b);//30
        System.out.println(a-b);//-10
        System.out.println(a*b);//200
        System.out.println(a/b);//0.5
        short c=7;
        short d=2;

        System.out.println(c%d);//1
        int f=8;  //8
        f++;  //9 it is called increment f= 8++f
        f++;  //10 postfix method f=9++f
        f++;  //11
        f--;  // 10 it is called decrement f= 11--f

        f--;  // 9 postfix method
        int k=11;
        ++k; // 12 it is called prefix  k= k++11
        System.out.println(k);
        --k; // 11 prefix method  k= k--12
        System.out.println(k);

        //assignment

        int p=15;
        // p= p+ 4 // 19
        p-=40;  // p= p-40 //  -25
        System.out.println(p);
        p*=40;   // p = p*40 //  -1000
        System.out.println(p);
        p/=40;   // p= p/40//  -25
        System.out.println(p);
        p%=40;  // p= p % 40 // -25
        System.out.println(p);

        // comparison

        int t=8;
        int r=9;
        boolean ans= t==9;
        System.out.println(ans);  // false
        int y=56;
        int x=76;
        boolean output = y<=x;
        System.out.println(output);  // true
        int i=8;
        int v=9;
        boolean what = i>=v;
        System.out.println(what); // false
        byte e=10;
        byte g=11;
        boolean kya = e!=g;
        System.out.println(kya); // true

        // logical

        int u=25;
        int o=45;
        boolean ans2 = u>o && o<50;
        // false // true// final ans is false
        System.out.println(ans2);
        int l=10;
        int n=45;
        boolean ans3 = l<n && n>40;
        //true// true // final ans is true
        System.out.println(ans3);

        byte z=90;
        byte s=80;
        boolean ans4= z>s || s>95;
        //true//true// ans will be true and //false //true // than also ans will be true
        //false//false//ans will be false
        System.out.println(ans4);
        int w=10;
        int j=20;
        boolean ans5 = (!(w>j && j<45 ));
        /*false//true// final ans will be true*/
        System.out.println(ans5);


















    }
}

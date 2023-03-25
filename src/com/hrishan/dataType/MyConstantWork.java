package com.hrishan.dataType;

public class MyConstantWork {
    public static void checkMyLogic(int a, int b ,int c){
        if (a != b || b!=c || c!=a){
            if (a>b || b<c){
                System.out.println(a + "is bigger number");

            } else if (a>b && b<c) {
                System.out.println(b + "may be small number");


            } else if (c<a && b>a) {
                System.out.println(c + "same number");

            }else {
                System.out.println("no numbers identify");

            }
        }
    }

    public static void main(String[] args) {
        checkMyLogic(759,458,240);
        checkMyLogic(57,65,45);
    }
}

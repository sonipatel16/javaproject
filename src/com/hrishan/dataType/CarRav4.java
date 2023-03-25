package com.hrishan.dataType;

public class CarRav4 {
    //state
     String colour= "silver";
     boolean manual= false;
     long size= 215;
    byte seat= 5;
    short height= 4;
     String name = "toyota rav4";

    //behaviour
    public  void driveFast() {
        System.out.println("i love to drive fast");


    }

    public  void automaticCar() {
        System.out.println("i always wanted this automaticCar");


    }

    public  static void magicalCar() {
        System.out.println("when i drive feels like magicalCar");
    }

    public static void main(String[] args) {
        // creating object

CarRav4 MyCarObject= new CarRav4();
 String colour= MyCarObject.colour;
        System.out.println(colour);

magicalCar();

        System.out.println(MyCarObject.colour);
        System.out.println(MyCarObject.manual);
        System.out.println(MyCarObject.size);
        System.out.println(MyCarObject.seat);
        System.out.println(MyCarObject.height);
        System.out.println(MyCarObject.name);
        MyCarObject.driveFast();
        MyCarObject.automaticCar();
        MyCarObject.magicalCar();















    }
}

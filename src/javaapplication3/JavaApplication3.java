package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num =1;
        Circle c = new Circle(num);
        System.out.println("Enter radius of first circle");
        c.setRadius(scan.nextInt());
        System.out.println("First circle");
        System.out.println(c.getArea());
       // c.count();
        Circle c2 = new Circle(num);
        System.out.println("Enter radius for secound circle");
        c2.setRadius(scan.nextInt());
        System.out.println("secound circle");
        System.out.println(c2.getArea());
      //  c2.count();
        Circle c3 = new Circle(num);
        System.out.println("enter radius for third circle");
        c3.setRadius(scan.nextInt());
        System.out.println("third circle");
        System.out.println(c3.getArea());
      //  c3.count();

        System.out.println("counter status : " + c.getCounterStatus());
        Sub s= new Sub(num);
        System.out.println(s.getCounterStatus());
    }
}

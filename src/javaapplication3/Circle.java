package javaapplication3;

public class Circle {

    private static int counter = 0;
    private double radius;
    private final double PI = 3.14;
public Circle(int num){
    System.out.println("hello "+ num);
    counter++;
}
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double Area = radius * radius * PI;
        return Area;
    }

  //  public void count() {
    //    counter++;
    //}

    public int getCounterStatus() {
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");

        return counter;
    }

}

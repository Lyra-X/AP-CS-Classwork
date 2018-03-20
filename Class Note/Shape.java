package com.company;

import java.util.Random;
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    public static void main(String[] args) {
        Random rng=new Random();
        Circle c= new Circle(rng.nextDouble());
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Square sqr=new Square(rng.nextInt());
        System.out.println(Math.abs(sqr.area()));
        System.out.println(sqr.perimeter());

        Triangle t=new Triangle(7,5,9,11);
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }
}

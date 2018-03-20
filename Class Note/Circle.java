package com.company;

public class Circle extends Shape {
    double radius;
    double PI=3.14;

    public Circle(double r) {
        radius = r;
    }

    public double area(){
        return PI *this.radius*this.radius;
    }

    public double perimeter(){
        return PI*2*this.radius;}
}

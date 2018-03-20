package com.company;

public class Triangle extends Shape {
    int base;
    int side1;
    int side2;
    int height;

    public Triangle(int b, int h, int s1, int s2) {
        base = b;
        height = h;
        side1 = s1;
        side2 = s2;
    }

    public double area() {
        return this.base * this.height / 2;
    }

    public double perimeter() {
        return base + side1 + side2;
    }
}

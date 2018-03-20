package com.company;

public class Square extends Shape {
    int length;

    public Square(int l){
        length=l;

    }
    public double area(){
        return length*length;
    }

    public double perimeter(){
        return 4*length;
    }
}

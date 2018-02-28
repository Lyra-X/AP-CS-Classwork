package com.company;

public class Bicycles {
        public static int Wheel = 2;
        public String brand;
        public double weight;
        public double velocity;
        boolean onRide;

        public Bicycles(){
            this.brand = "";
            this.weight = 23.0;
            onRide = false;
            this.velocity = 15.5;
        }

        public Bicycles(String brand, double weight, boolean onRide, double velocity){
            this.brand = brand;
            this.weight = weight;
            this.onRide = onRide;
            this.velocity = velocity;
        }

        public boolean ride(){
            return onRide;
        }

        public void accelerate(){
            velocity +=4;
        }

    }

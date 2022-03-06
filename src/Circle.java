package edu.upc.eetac.dsa;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
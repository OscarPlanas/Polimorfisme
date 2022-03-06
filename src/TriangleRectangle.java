package edu.upc.eetac.dsa;

public class TriangleRectangle extends Figure{

    private double base;
    private double height;

    public TriangleRectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        double area = (this.base * this.height)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
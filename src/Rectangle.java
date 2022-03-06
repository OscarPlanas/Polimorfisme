package edu.upc.eetac.dsa;

public class Rectangle extends Figure{
    //LA clase rectangle hereda de figure
    private double l1;
    private double l2;

    //Gets de los atributos necesarios para los que heredan
    public double getL1(){
        return l1;
    }
    public double getL2(){
        return l2;
    }

    public Rectangle (double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }

    public double area(){
        //El propio programa se da cuenta de que esta operación esta definida en la clase abstracta FIGURA
        return this.l1 * this.l2;
    }
    
    @Override
    public String toString(){
        return "||Rectangle [l1: " +this.l1+ " l2: " +this.l2 + "] area: "+this.area()+"||";
    }
}
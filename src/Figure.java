package edu.upc.eetac.dsa;

public abstract class Figure implements  Comparable<Figure>{
    //Una figura sera aquella que sea capaz de implementar una operación Area!!
    public  abstract double area();

    public int compareTo(Figure f) {
        return (int)(f.area()-this.area());// Si retornara un valor cero si son iguales, retornará un 1 en caso que sea mayor.
    }
}
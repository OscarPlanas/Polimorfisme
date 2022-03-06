package edu.upc.eetac.dsa;

public class Rombe extends Rectangle{

    //Puesto que un rombo tiene el mismo metodo para calcular el area que un rectangulo, puede heredar de este
    public Rombe(double lado, double diagonal){
        super (lado, diagonal);
    }

    @Override
    public String toString (){return "||Rombe [costat: "+this.getL1()+"diagonal:" +this.getL2()+"] area:" +super.area()+ "||";}

}
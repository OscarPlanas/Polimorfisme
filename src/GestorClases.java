package edu.upc.eetac.dsa ;

import java.util.Arrays;

/**
 * Clase que gestionara y operara con las figuras
 */
public class GestorClases {
    /**
     * Metodo void que automaticamente usando --comparableTo-- ordena las areas de kas figuras de v
     * @param v
     */
    public static void sort (Figure[] v){
        Arrays.sort(v);
    }

    /**
     * Metodo que mediante el for realiza la suma numerica de las areas de todas las figuras del vector v
     * @param v vector que se rellena de objetos Figura
     * @return devuelve el valor numerico de la suma de estas
     */
    public static double suma (Figure[] v) {
        double ret=0;
        for (Figure f:v){
            ret+=f.area();
            //Area es un metodo POLIMORFICO
        }
        return ret;
    }
    public static void main(String[] args) {
        /**
         * Creamos el vector de tres posiciones de clase FIGURA
         */

        Figura[] v= new Figura[5];
        v[0]= new Circle (5);
        v[1]= new Rectangle(4,5);
        v[2]= new Square(2);
        v[3]= new Rombo(3,8);
        v[4] = new TriangleRectangle(1,2);

        double r= GestorClases.suma(v);

        System.out.println("El resultado és: " +r);
        /**
         * Muestra en pantalla el array de strings tal cual
         */
        System.out.println(Arrays.asList(v));
        /**
         * Ordeno los arrays (segun su area)
         */
        GestorClases.sort(v);
        /**
         * Muestra en pantalla ahora el vector ordenado
         */
        System.out.println(Arrays.asList(v));

    }
}
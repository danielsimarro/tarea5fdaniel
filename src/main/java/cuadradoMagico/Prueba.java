/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradoMagico;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        //Creación de una lista
        
        ArrayList<CuadradoMagico> lista = new ArrayList<CuadradoMagico>();
       
        //Creación de 15 objetos
        CuadradoMagico cm1 = new CuadradoMagico();
        CuadradoMagico cm2 = new CuadradoMagico();
        CuadradoMagico cm3 = new CuadradoMagico();
        CuadradoMagico cm4 = new CuadradoMagico();
        CuadradoMagico cm5 = new CuadradoMagico();
        CuadradoMagico cm6 = new CuadradoMagico();
        CuadradoMagico cm7 = new CuadradoMagico();
        CuadradoMagico cm8 = new CuadradoMagico();
        CuadradoMagico cm9 = new CuadradoMagico();
        CuadradoMagico cm10 = new CuadradoMagico();
        CuadradoMagico cm11 = new CuadradoMagico();
        CuadradoMagico cm12 = new CuadradoMagico();
        CuadradoMagico cm13 = new CuadradoMagico();
        CuadradoMagico cm14 = new CuadradoMagico();
        CuadradoMagico cm15 = new CuadradoMagico();
        
        //Añadir objetos a lista
        
        lista.add(cm1);
        lista.add(cm2);
        lista.add(cm3);
        lista.add(cm4);
        lista.add(cm5);
        lista.add(cm6);
        lista.add(cm7);
        lista.add(cm8);
        lista.add(cm9);
        lista.add(cm10);
        lista.add(cm11);
        lista.add(cm12);
        lista.add(cm13);
        lista.add(cm14);
        lista.add(cm15);
        
        //Lammar a los metodos de cada objeto de la lista
        for(int i = 0; i < lista.size();i++){
            System.out.println("La matiz del cuadrado magico numero " + (i+1) + " es:");
            lista.get(i).imprimirMatriz();
            System.out.println("Es un cuadrado mágico : " + lista.get(i).cuadradoMagico());
        }
       
    }
}

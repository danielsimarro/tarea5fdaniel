/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradoMagico;

/**
 *
 * @author NitroPc
 */
public class Main {
    public static void main(String[] args) {
        CuadradoMagico cm1 = new CuadradoMagico();
        
        cm1.imprimirMatriz();
        
        System.out.println("La suma de la fila es: " + cm1.sumaFila(0));
    }
}
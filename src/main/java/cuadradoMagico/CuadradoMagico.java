/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradoMagico;

import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class CuadradoMagico {

    //Atributo matiz inicilizado con un tamaño de 3x3
    private int[][] matriz = new int[3][3];

    //Constructor sin parametros rellenando la matiz con numero aleatorios del 1 al 9
    public CuadradoMagico() {

        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio();
            }
        }

    }

    //Metodo para generar numeros aleatorido del 1-9
    public static int numeroAleatorio() {

        Random aleatorio = new Random();

        return aleatorio.nextInt(9 - 1 + 1) + 1;
    }

    //Metodo para sumar la fila indicada de la matriz
    public int sumaFila(int fila) {

        if (fila >= 0 && fila < 3) {

            int suma = 0;

            for (int i = 0; i < this.matriz[fila].length; i++) {
                suma += matriz[fila][i];
            }

            return suma;

        }

        return 0;
    }
    
    //Metodo para sumar la columna indcada de la matriz
    public int sumarColumna(int columna){
    
        if(columna >= 0 && columna < 3){
           
            int suma = 0;
            
            for(int i = 0; i<matriz.length;i++){
                suma += matriz[i][columna];
            }
            
            return suma;
            
        }
        
        return 0;
    }
    
    //Metodo para sumar la diagonal principal 
    public int diagonalPrincipal(){
        
        int suma=0;
        
        for(int i = 0 ,j=0;i<matriz.length;i++,j++){
            suma += matriz[i][j];
        }
        
        return suma;
    }
    
    
    //Metodo para imprimir la matriz
    public void imprimirMatriz() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
}

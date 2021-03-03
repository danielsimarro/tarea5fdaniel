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
    
    private int [][] matriz = new int [3][3];

    public CuadradoMagico() {
        
        for(int i = 0;i<this.matriz.length;i++){
            for(int j = 0; j<this.matriz[i].length;j++){
                matriz[i][j]=numeroAleatorio();
            }
        }
        
    }
    
    public static int numeroAleatorio(){
        
        Random aleatorio = new Random();
        
        return aleatorio.nextInt(9-1+1)+1;
    }
    
    public int sumaFila(int fila){
        
        if(fila>=0 && fila<matriz.length){
            
        int suma = 0;
        
        for(int i = 0; i<this.matriz[fila].length;i++){
            suma += matriz[fila][i];
        }
        
        return suma;
        
        }
        
        return 0;
    }
    
    public void imprimirMatriz(){
        for(int i = 0;i<this.matriz.length;i++){
            for(int j = 0; j<this.matriz[i].length;j++){
                System.out.print("[" + matriz[i][j] + "]  ");
            }
            System.out.println("");
        }
    }
}

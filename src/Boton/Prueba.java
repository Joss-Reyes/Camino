/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boton;

import java.awt.Color;

/**
 *
 * @author black
 */
public class Prueba {
    
    int fila[] = {0,0,0,0};
    int columna[] = {0,0,0,0};
    int contador = 0;
    
    static String [][] botones = new String [15][15];
    
    //en el metodo guardar() se guardas los puntos a buscar en el arreglo
    //P1 hasta el P5
    
    public void guardar(int x, int y){
        columna[contador] = x/10;
        fila[contador] = y/10;
        contador++;
    }
    
    public void Listado(){
        int j, af = fila[1], ac = columna[1];
        for(j=2; j<fila.length; j++){
            fila[j-1] = fila[j];
            columna[j-1] = columna[j];
        }
        fila[j-1] = af;
        columna[j-1] = ac;
       
        for(int i=0; i<fila.length; i++){
            System.out.println(fila[i] + "," + columna[i]);
        }
       Rutas();
    }
    
    public void Rutas(){
        for(int i=1; i<fila.length; i++){
            int mx, my, x, y, ax, ay, aux, auy;
           
            if(fila[i-1]<fila[i]){
                mx = 1;
                x = fila[i] - fila[i-1];
            }else{
                mx = -1;
                x = fila[i-1] - fila[i];
            }
            if(columna[i-1]<columna[i]){
                my = 1;
                y = columna[i]-columna[i-1];
            }else{
                my = - 1;
                y = columna[i-1]-columna[i];
            }
            ax = fila[i-1];
            ay = columna[i-1];
            
            aux = ax;
            auy = ay;
            
            if(x<y){
            
                for(int a=1; a<x; a++){
                    ax += mx;
                    ay += my;
                    //botones[ax][ay].setBackground(Color.green);
                    //botones[ax][ay].setBackground(Color.blue);
                    //botones[ax][ay].setBackground(Color.green);
                    System.out.println("*");
                   
                    //tabla.setValueAt("X", ax, ay);
                }
               
                for(int a=x; a<y; a++){
                    ay += my;
                    //botones[ax][ay].setBackground(Color.yellow);
                    System.out.println("*");
                }
            }else{
           
                for(int a=1; a<y; a++){
                    ax += mx;
                    ay += my;
                    //botones[ax][ay].setBackground(Color.yellow);
                    System.out.println("*");
             
                }
               
                for(int a=y; a<x; a++){
                    ax += mx;
                    //botones[ax][ay].setBackground(Color.yellow);
                   System.out.println("*");
                }
            }
        }
    }
    public static void main(String args[]){
        //llenamos la matriz con caracteres
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                botones[i][j] = ".";
            }
        }
        
        //imprimir la matriz con los caracteres
        int cont = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if(cont==15){
                    System.out.println();
                    cont = 0;
                }
                System.out.print("["+botones[i][j]+"]");
                cont++;
                
            }
        }
        
        
        //guardar();
        System.out.println("");
    }
    
    
    
}

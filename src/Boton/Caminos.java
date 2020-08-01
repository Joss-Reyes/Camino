/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boton;

/**
 *
 * @author black
 */
/*
public class Caminos {
    
}*/

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Huerfanita
 */
public class Caminos {
    JButton[][] botones;
    JLabel pasitoslbl;
    int fila[] = {0,0,0,0,0};
    int columna[] = {0,0,0,0,0};
    int contador = 0;
    int pasos = 0;
    
    public void guardar(int x, int y){
        columna[contador] = x/30;
        fila[contador] = y/30;
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
                    pasos++;
                    ax += mx;
                    ay += my;
                    botones[ax][ay].setBackground(Color.yellow);
                    
                }
               
                for(int a=x; a<y; a++){
                    ay += my;
                    pasos++;
                    botones[ax][ay].setBackground(Color.yellow);
                }
            }else{
                for(int a=1; a<y; a++){
                    ax += mx;
                    ay += my;
                    pasos++;
                    botones[ax][ay].setBackground(Color.yellow);
                }
                for(int a=y; a<x; a++){
                    ax += mx;
                    pasos++;
                    botones[ax][ay].setBackground(Color.yellow);  
                }
            }
        }
    }
    
}

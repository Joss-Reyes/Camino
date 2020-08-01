/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camino;

/**
 *
 * @author black
 */
/*
public class Boton {
    
}*/

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Boton extends JButton implements ActionListener {
    static String coordenadasBtn;
    
    //-------- Constructor con parametros para posicionar a los botones ------//
    public Boton( int pos_x, int pos_y, int ancho, int alto ){ 
        //Se coloca el boton en un lugar y se le da un tamanio
        setBounds(pos_x, pos_y, ancho, alto);
        
        //Se agrega el action listener en este caso la misma clase
        addActionListener(this);
    }
    //------------------------------------------------------------------------//
    
    //---------------------- Se asigna una el nombre del boton ---------------//
    public void setNombre( int f, int c ){
        setText( f + " , " + c );
        //System.out.println("Boton [" + f + ", " + c + "]");
    }
    //------------------------------------------------------------------------//
    public void setColor(){
        setBackground(new Color((int)Math.random() * 256, (int)Math.random() * 256, (int)Math.random() * 256));
    }
    //------------------ Al darle click realizara este metodo ----------------//
    public void actionPerformed( ActionEvent e ){
        //Se asigna el color de fondo azul
        //setBackground(new Color((int)Math.random() * 256, (int)Math.random() * 256, (int)Math.random() * 256));
        //Se asigna un color de letra color blanco
        setColor();
        setForeground(Color.WHITE);
        coordenadasBtn = getText();
        System.out.println(coordenadasBtn);
        
        
        
    }
    //------------------------------------------------------------------------//
}
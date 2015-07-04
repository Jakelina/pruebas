/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import javax.swing.JFrame;

/**
 *
 * @author sanz11@
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame ventana = new JFrame();
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Primer juego");
        //Instanciamos nuestra pantalla
        PanelJuego panel = new PanelJuego();
        ventana.add(panel);
        //Decimos para que aparesca la ventana
        ventana.setVisible(true);
        //ventana
         while(true){
            Thread.sleep(10000);
        }
        
        
    }
    
}

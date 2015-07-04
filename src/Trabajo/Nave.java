/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import static Trabajo.PanelJuego.ALTURA_PANEL;
import static Trabajo.PanelJuego.ANCHO_PANEL;
import javax.swing.ImageIcon;



/**
 *
 * @author sanz11@
 */
public class Nave extends Sprite {

    public Nave(int x, int y, int vx, int vy, int radio, int angulo, int va_angulo, int altura, int ancho, ImageIcon foto) {
        super(x, y, vx, vy, radio, angulo, va_angulo, altura, ancho, foto);
    }
public void mover(){
        vx =vx+1;
        angulo = angulo+va_angulo;
        
        if(vx > 90){
        x = ((int) (radio*Math.cos( (angulo*Math.PI)/ 360)))+ vx ;
        y = ((int) (radio*Math.sin((angulo*Math.PI)/360))+vy);
       x=vx;
       
        }
    
    }
    
}

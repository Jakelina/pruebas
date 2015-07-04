/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author sanz11@
 */
public class PanelJuego extends JPanel implements KeyListener,MouseListener, Runnable {

    public static final int ANCHO_PANEL = 800;
    public static final int ALTURA_PANEL = 600;
    private Image imagenJuego;
    private Nave jugador1;
    private Thread animador;

    public PanelJuego() {
        //1: Prepara Panel

        setPreferredSize(new Dimension(ANCHO_PANEL, ALTURA_PANEL));
        setFocusable(true);//crear el foco dentro del panel
        requestFocus();

        //2: Crear Sprites
        ImageIcon fotoNave = new ImageIcon(getClass().getResource("nav1.png"));
        jugador1 = new Nave(0, 0, 0, 0, 0, 0, 0, fotoNave.getIconWidth(), fotoNave.getIconHeight(), fotoNave);

        //3:Definir Listeners
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify(); //To change body of generated methods, choose Tools | Templates.

        animador = new Thread(this);
        animador.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_0) {
            jugador1.setRadio(100);
            jugador1.setVa_angulo(70);
            jugador1.setVy(250);
            jugador1.setAngulo(50);
            
            

        }
        //jugador1 = new Nave(10, 10, 0, 0, fotoNave.getIconWidth(), fotoNave.getIconHeight(), fotoNave);
        //listamisil1= new Misil(0, 0, 0, 0,fotoMisil.getIconWidth(), fotoMisil.getIconHeight(), fotoMisil);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_0) {
            jugador1.setRadio(0);
            jugador1.setVa_angulo(0);
            jugador1.setX(0);
            jugador1.setVx(0);
            
        }
    }

    @Override
    public void run() {
        while (true) {
            //:1 Actualizar Valores de stripes
            actualizarValores();

            //2: Crear Nueva imagen
            crearImagen();

            //3: Colocar Imagen en el panel
            colocarImagen();

            try {
                Thread.sleep(10);
            } catch (Throwable e) {
            }
        }
    }

    public void actualizarValores() {
        jugador1.mover();
    }

    public void crearImagen() {
        imagenJuego = createImage(ANCHO_PANEL, ALTURA_PANEL);
        Graphics2D pincelImagen = (Graphics2D) imagenJuego.getGraphics();
        pincelImagen.drawImage(
                jugador1.getFoto().getImage(),
                jugador1.getX(),
                jugador1.getY(),
                jugador1.getAltura(),
                jugador1.getAncho(),
                null);
    }

    public void colocarImagen() {
        Graphics2D pincelPanel = (Graphics2D) getGraphics();
        pincelPanel.drawImage(
                imagenJuego,
                0,
                0,
                getWidth(),
                getHeight(),
                null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //x, y, vx, vy, radio, angulo, va_angulo, altura, ancho, foto
        //0,0,50,150,10,75,10,10,10,
            jugador1.setRadio(100);
            jugador1.setVa_angulo(70);
            jugador1.setVy(250);
            jugador1.setAngulo(50);
            
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
         jugador1.setRadio(0);
            jugador1.setVa_angulo(1);
            jugador1.setX(0);
            jugador1.setVx(0);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

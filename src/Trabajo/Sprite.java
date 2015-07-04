/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author sanz11@
 */
public class Sprite {
    private int a;
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    protected int radio;
    protected int angulo;
    private int altura;
    private int ancho;
    protected int va_angulo;
    protected ImageIcon foto;

    public Sprite(int x, int y, int vx, int vy, int radio, int angulo, int va_angulo,int altura, int ancho, ImageIcon foto) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.radio = radio;
        this.angulo = angulo;
        this.va_angulo = va_angulo;
        this.ancho=ancho;
        this.altura=altura;
        this.foto = foto;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the vx
     */
    public int getVx() {
        return vx;
    }

    /**
     * @param vx the vx to set
     */
    public void setVx(int vx) {
        this.vx = vx;
    }

    /**
     * @return the vy
     */
    public int getVy() {
        return vy;
    }

    /**
     * @param vy the vy to set
     */
    public void setVy(int vy) {
        this.vy = vy;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the angulo
     */
    public int getAngulo() {
        return angulo;
    }

    /**
     * @param angulo the angulo to set
     */
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    /**
     * @return the va_angulo
     */
    public int getVa_angulo() {
        return va_angulo;
    }

    /**
     * @param va_angulo the va_angulo to set
     */
    public void setVa_angulo(int va_angulo) {
        this.va_angulo = va_angulo;
    }

    /**
     * @return the foto
     */
    public ImageIcon getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    

    }
    
    
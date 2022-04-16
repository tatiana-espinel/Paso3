/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Dibujar {
    public static void Hacerlineas (Graphics tatiana,  int x1, int x2, int y1, int y2)
    {
        tatiana.drawLine(x1, x2, y1, y2);
  
    }
    public static void HacerCuadros (Graphics tatiana,  int x, int y, int ancho, int alto)
    {
        tatiana.drawRect(x, y, ancho, alto);
        
    }
    public static void HacerCirculos (Graphics tatiana,  int x, int y, int ancho, int alto)
    {
        tatiana.drawOval(x, y, alto, ancho);
    }
     public static void HacerOvalo (Graphics tatiana,  int x, int y, int ancho, int alto)
    {
        tatiana.drawOval(x, y, alto, ancho);
    }
    
}

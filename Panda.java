/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Panda extends JPanel{
    
    public void paint (Graphics tatiana){
        
        super.paint(tatiana);
        //Cara del panda
        int [] puntosX1={70,120,180,230,200,140,120,100,40,20};
        int [] puntosY1={30,20,30,120,160,190,180,190,160,120};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX1,puntosY1,10);
        //Oreja izquierda
        int [] puntosX2={30,70,30,10};
        int [] puntosY2={10,30,100,50};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX2,puntosY2,4);
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX2,puntosY2,4);
        //Oreja derecha 
        int [] puntosX3={180,210,240,220};
        int [] puntosY3={30,10,50,100};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX3,puntosY3,4);
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX3,puntosY3,4);
        //Mejilla izquierda
        int [] puntosX4={70,100,40,20};
        int [] puntosY4={30,70,160,120};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX4,puntosY4,4);
        //Mejilla derecha
        int [] puntosX5={180,230,200,150};
        int [] puntosY5={30,120,160,70};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX5,puntosY5,4);
        //Ojo izquierdo
        int [] puntosX6={100,90,80,60};
        int [] puntosY6={70,130,150,130};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX6,puntosY6,4);
        tatiana.fillPolygon(puntosX6,puntosY6,4);
        //Ojo derecho
        int [] puntosX7={150,183,160,150};
        int [] puntosY7={70,130,150,130};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX7,puntosY7,4);
        tatiana.fillPolygon(puntosX7,puntosY7,4);
        //Hocico
        int [] puntosX8={160,155,145,120,95,85,80};
        int [] puntosY8={150,180,193,200,192,180,150};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolyline(puntosX8,puntosY8,7);
        //Nariz
        int [] puntosX9={90,120,150,140,120,100};
        int [] puntosY9={160,165,160,170,175,170};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX9,puntosY9,6);
        tatiana.fillPolygon(puntosX9,puntosY9,6);
        tatiana.drawLine(120, 175, 120, 180);
        //Boca
        int [] puntosX10={120,130,120,110};
        int [] puntosY10={180,185,190,185};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX10,puntosY10,4);
        tatiana.fillPolygon(puntosX10,puntosY10,4);
    }
     public static void main (String []args){
        JFrame ventana= new JFrame ("Graficas-Panda");
        Panda objeto = new Panda();
        ventana.add(objeto);
        ventana.setSize(300,300);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

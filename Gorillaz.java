/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Gorillaz extends JPanel{
    
    public void paint (Graphics tatiana){
        
        super.paint(tatiana);
        
        Graphics2D t2d = (Graphics2D)tatiana;
        //Cara
        int [] puntosX1={140,170,240,300,290,240,210,200,160,140};
        int [] puntosY1={210,260,280,220,140,70,140,90,140,210};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX1,puntosY1,10);
        //Ceja izquierda
        int [] puntosX2={150,190,180,140};
        int [] puntosY2={180,130,120,140};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX2,puntosY2,4);
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX2,puntosY2,4);
        //Ceja derecha
        int [] puntosX3={230,240,280,275};
        int [] puntosY3={120,110,120,135};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX3,puntosY3,4);
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX3,puntosY3,4);
        //Ojos
        t2d.setColor(Color.BLACK);
        t2d.fill(new Ellipse2D.Double(230,130,45,40));
        t2d.fill(new Ellipse2D.Double(150,155,45,40));
        //Ceño
        tatiana.drawLine(200, 150, 204, 165);
        tatiana.drawLine(204, 150, 210, 165);
        tatiana.drawLine(212, 150, 215, 160);
        //Nariz
        tatiana.drawLine(195, 210, 215, 205);
        tatiana.drawLine(219, 205, 240, 210);
        t2d.fill(new Ellipse2D.Double(205,210,5,4));
        //Boca
        tatiana.drawLine(190, 250, 195, 248);
        t2d.draw(new QuadCurve2D.Double(200,245,230,227,260,230));
        //Cabello
        int [] puntosX4={80,130,170,140,220,220,240,290,260,350,310,
            360,320,360,320,380,310,300,290,240,210,200,160,140,140,
            130,130,80,100,80,110,120,80,110,80,120,170};
        int [] puntosY4={90,90,50,30,40,10,40,20,50,100,100,160,150,
            170,150,180,160,220,140,70,140,90,140,210,190,200,180,
            220,190,210,160,140,120,100,80,90,50};
        tatiana.setColor(new Color(49,103,167));
        tatiana.fillPolygon(puntosX4,puntosY4,34);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX4,puntosY4,34);
       //Cuello
       t2d.setColor(Color.BLACK);
       t2d.setStroke (new BasicStroke(1));
       t2d.drawLine(195, 269, 190, 325);
       t2d.drawLine(275, 245, 280, 310);
       t2d.drawLine(190, 310, 80, 360);
       t2d.drawLine(80, 360, 60, 440);
       //Tendones
       t2d.draw(new QuadCurve2D.Double(205,271,200,320,225,360));
       t2d.draw(new QuadCurve2D.Double(275,255,265,320,245,355));
       //Cuello Camisa 
       t2d.draw(new QuadCurve2D.Double(150,328,230,420,300,324));
        //Camisa
       t2d.drawLine(280, 310, 380, 370);
       t2d.drawLine(380, 370, 400, 440);
       //Brazos
       t2d.drawLine(140, 440, 145, 470);
       t2d.drawLine(330, 410, 325, 460);
       //Arrugas de la camiseta
       t2d.drawLine(95, 430, 143, 440);
       t2d.drawLine(125, 420, 150, 460);
       t2d.drawLine(350, 420, 325, 450);
    }
     public static void main (String []args){
        JFrame ventana= new JFrame ("Graficas-Gorillaz");
        Gorillaz objeto = new Gorillaz();
        ventana.add(objeto);
        ventana.setSize(480,530);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

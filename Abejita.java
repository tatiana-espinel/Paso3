/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Abejita extends JPanel{
    
    public void paint (Graphics tatiana){
        
        super.paint(tatiana);
        
        Graphics2D t2d = (Graphics2D)tatiana;
       
        //Ala izquierda
        t2d.setColor(new Color(234,247,254));
        t2d.fill(new Arc2D.Double(140,60,100,230,0,360,Arc2D.CHORD));
        t2d.setStroke(new BasicStroke(5));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(140,60,100,230,0,360,Arc2D.CHORD));
        //Ala derecha
        t2d.setColor(new Color(234,247,254));
        t2d.fill(new Arc2D.Double(240,60,100,230,0,360,Arc2D.CHORD));
        t2d.setStroke(new BasicStroke(5));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(240,60,100,230,0,360,Arc2D.CHORD));
        //Lapiz
        int [] puntosX2={110,130,130,110};
        int [] puntosY2={400,400,500,500};
        tatiana.setColor(new Color(240,151,202));
        tatiana.fillPolygon(puntosX2,puntosY2,4);
        //Curva del borrador
        t2d.setColor(new Color(240,151,202));
        t2d.fill(new QuadCurve2D.Double(110,400,70,450,110,500));
        t2d.setColor(Color.BLACK);
        t2d.setStroke(new BasicStroke(5));
        t2d.draw(new QuadCurve2D.Double(110,400,70,450,110,500));
        //Curva izquierda
        int [] puntosX3={130,160,160,130};
        int [] puntosY3={400,400,500,500};
        tatiana.setColor(new Color(153,153,153));
        tatiana.fillPolygon(puntosX3,puntosY3,4);
        //Curva derecha
        t2d.setStroke(new BasicStroke(5)) ;
        t2d.setColor(new Color(153,153,153));
        t2d.fill(new QuadCurve2D.Double(130,400,100,450,130,500));
        t2d.setColor(Color.BLACK);
        t2d.setStroke(new BasicStroke(5));
        t2d.draw(new QuadCurve2D.Double(130,400,100,450,130,500));
        //curva parte gris del borrador
        t2d.setColor(Color.YELLOW);
        t2d.fill(new QuadCurve2D.Double(150,400,120,430,150,500));
        t2d.setColor(Color.BLACK);
        t2d.setStroke(new BasicStroke(5));
        t2d.draw(new QuadCurve2D.Double(150,400,120,430,150,500));
        //Color externo
        int [] puntosX={150,400,450,400,150};
        int [] puntosY={400,400,450,500,500};
        t2d.setColor(Color.YELLOW);
        tatiana.fillPolygon(puntosX,puntosY,5);
        //Punta del lapiz
        int [] puntosX4={110,400,450,400,110};
        int [] puntosY4={400,400,450,500,500};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolyline(puntosX4,puntosY4,5);
        //Punta lapiz
        int [] puntosX5={400,450,400,380};
        int [] puntosY5={400,450,500,450};
        tatiana.setColor(new Color(254,232,165));
        tatiana.fillPolygon(puntosX5,puntosY5,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX5,puntosY5,4);
        //grafiti
        int [] puntosX6={430,450,430,420};
        int [] puntosY6={430,450,469,450};
        tatiana.setColor(new Color(101,101,101));
        tatiana.fillPolygon(puntosX6,puntosY6,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX6,puntosY6,4);
        //Texto david
        tatiana.setColor(Color.BLACK);
        Font Fuente = new Font("Tenorite",Font.PLAIN,70);
        tatiana.setFont(Fuente);
        tatiana.drawString("David", 170,470);
        //Cuerpo de la abeja
        t2d.setColor(Color.YELLOW);
        t2d.fill(new Arc2D.Double(100,180,360,220,0,360,Arc2D.CHORD));
        t2d.setStroke(new BasicStroke(10));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(100,180,360,220,0,360,Arc2D.CHORD));
        //Franja derecha
        t2d.setStroke(new BasicStroke(40));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(220,203,50,213,100,119,Arc2D.OPEN));
        //Franja izquierda
        t2d.setStroke(new BasicStroke(10));
        t2d.setColor(Color.BLACK);
        for (int i=1;i<20; i++){
        t2d.draw(new QuadCurve2D.Double(118+i,244-i,100+i,292,118+i,336+i));
        }
        //Boca
        t2d.setStroke(new BasicStroke(8));
        t2d.setColor(Color.BLACK);
        t2d.draw(new QuadCurve2D.Double(350,310,375,350,400,310));
        //Ojo derecho
        t2d.setColor(Color.WHITE);
        t2d.fill(new Arc2D.Double(350,135,130,150,0,360,Arc2D.CHORD));
        t2d.setStroke(new BasicStroke(5));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(350,135,130,150,0,360,Arc2D.CHORD));
        //Iris derecho
        t2d.setColor(Color.BLACK);
        t2d.fill(new Arc2D.Double(390,190,42,50,0,360,Arc2D.CHORD));
        //Ojo izquierdo
        t2d.setColor(Color.WHITE);
        t2d.fill(new Arc2D.Double(250,130,140,170,0,360,Arc2D.CHORD));
        t2d.setStroke(new BasicStroke(5));
        t2d.setColor(Color.BLACK);
        t2d.draw(new Arc2D.Double(250,130,140,170,0,360,Arc2D.CHORD));
        //Iris izquierdo
        t2d.setColor(Color.BLACK);
        t2d.fill(new Arc2D.Double(300,190,48,53,0,360,Arc2D.CHORD));
        
    }
    
        public static void main (String []args){
        JFrame ventana= new JFrame ("Graficas-Abejita");
        Abejita objeto = new Abejita();
        ventana.add(objeto);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

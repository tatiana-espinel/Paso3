/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class ColoresBruja extends JPanel {
    
    public void paint (Graphics tatiana){
        
        super.paint(tatiana);
         //Punta del sombrero 
        int [] puntosX1={60,120,160,140,180};
        int [] puntosY1={120,10,40,40,120};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX1,puntosY1,5);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX1,puntosY1,5);
         //Cinta negra del sombrero
        int [] puntosX2={80,160,170,70};
        int [] puntosY2={80,80,100,100};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX2,puntosY2,4);
        //Hebilla
        int [] puntosX3={100,140,140,100};
        int [] puntosY3={70,70,110,110};
        tatiana.setColor(new Color(253,247,51));
        tatiana.fillPolygon(puntosX3,puntosY3,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX1,puntosY1,5);
        //Hebilla interior
        int [] puntosX4={110,130,130,110};
        int [] puntosY4={80,80,100,100};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX4,puntosY4,4);
        //Base del sombrero
        int [] puntosX5={10,230,230,10};
        int [] puntosY5={120,120,130,130};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX5,puntosY5,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX5,puntosY5,4);
        //Cabello izquierdo
        int [] puntosX6={60,0,10,40,20,30,50,40,50,80};
        int [] puntosY6={130,180,190,160,190,200,170,210,220,130};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX6,puntosY6,10);
        //Cabello derecho
        int [] puntosX7={160,190,200,190,210,220,200,230,240,180};
        int [] puntosY7={130,220,210,170,200,190,160,190,180,130};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX7,puntosY7,10);
        //Cara
        int [] puntosX8={80,60,60,90,150,180,180,160};
        int [] puntosY8={130,190,210,240,240,210,190,130};
        tatiana.setColor(new Color(136,218,79));
        tatiana.fillPolygon(puntosX8,puntosY8,8);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX8,puntosY8,8);
        //Ojo izquierdo
        int [] puntosX9={80,110,110,80};
        int [] puntosY9={140,140,170,170};
        tatiana.setColor(new Color(254,254,254));
        tatiana.fillPolygon(puntosX9,puntosY9,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX9,puntosY9,4);
        //Iris izquierdo
        int [] puntosX10={90,110,110,90};
        int [] puntosY10={150,150,170,170};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX10,puntosY10,4);
         //Ojo derecho
        int [] puntosX11={130,160,160,130};
        int [] puntosY11={140,140,170,170};
        tatiana.setColor(new Color(254,254,254));
        tatiana.fillPolygon(puntosX11,puntosY11,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX11,puntosY11,4);
        //Iris derecho
        int [] puntosX12={130,150,150,130};
        int [] puntosY12={150,150,170,170};
        tatiana.setColor(Color.BLACK);
        tatiana.fillPolygon(puntosX12,puntosY12,4);
        //Nariz
        int [] puntosX13={160,70,70,130};
        int [] puntosY13={170,170,190,190};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolyline(puntosX13,puntosY13,4);
        //Boca
        int [] puntosX14={90,90,100,140,150,150};
        int [] puntosY14={200,210,220,220,210,200};
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolyline(puntosX14,puntosY14,6);
        //Tronco
        int [] puntosX15={150,180,180,60,60,90};
        int [] puntosY15={240,320,330,330,320,240};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX15,puntosY15,6);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX15,puntosY15,6);
        //Brazo izquierdo
        int [] puntosX16={90,30,40,80};
        int [] puntosY16={240,300,310,270};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX16,puntosY16,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX16,puntosY16,4);
        //Mano izquierda
        int [] puntosX17={30,20,20,40,40};
        int [] puntosY17={300,310,320,320,310};
        tatiana.setColor(new Color(136,218,79));
        tatiana.fillPolygon(puntosX17,puntosY17,5);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX17,puntosY17,5);
         //Brazo derecho
        int [] puntosX18={150,210,220,160};
        int [] puntosY18={240,230,240,270};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX18,puntosY18,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX18,puntosY18,4);
        //Mano derecha
        int [] puntosX19={210,210,220,220,230,240,220};
        int [] puntosY19={230,210,210,220,210,230,240};
        tatiana.setColor(new Color(136,218,79));
        tatiana.fillPolygon(puntosX19,puntosY19,7);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX19,puntosY19,7);
        //Escoba derecha
        int [] puntosX20={60,10,10,60};
        int [] puntosY20={320,320,330,330};
        tatiana.setColor(new Color(183,134,89));
        tatiana.fillPolygon(puntosX20,puntosY20,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX20,puntosY20,4);
        //Escoba izquierda
        int [] puntosX21={180,230,230,180};
        int [] puntosY21={320,320,330,330};
        tatiana.setColor(new Color(183,134,89));
        tatiana.fillPolygon(puntosX21,puntosY21,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX21,puntosY21,4);
        //Tabla
        int [] puntosX22={230,240,330,330,240,230};
        int [] puntosY22={320,290,290,360,360,330};
        tatiana.setColor(new Color(251,207,51));
        tatiana.fillPolygon(puntosX22,puntosY22,6);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX22,puntosY22,6);
        //Pierna izquierda
        int [] puntosX23={90,110,130,130,120,110};
        int [] puntosY23={330,370,370,360,360,330};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX23,puntosY23,6);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX23,puntosY23,6);
        //Media izquierda
        int [] puntosX24={130,130,140,140};
        int [] puntosY24={360,370,370,360};
        tatiana.setColor(new Color(253,247,52));
        tatiana.fillPolygon(puntosX24,puntosY24,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX24,puntosY24,4);
        //Zapato izquierdo
        int [] puntosX25={140,140,150,160,160};
        int [] puntosY25={360,370,370,390,360};
        tatiana.fillPolygon(puntosX25,puntosY25,5);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX25,puntosY25,5);
         //Pierna derecha
        int [] puntosX26={130,150,170,170,160,150};
        int [] puntosY26={330,360,360,350,350,330};
        tatiana.setColor(new Color(158,75,212));
        tatiana.fillPolygon(puntosX26,puntosY26,6);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX26,puntosY26,6);
        //Media derecha
        int [] puntosX27={170,170,180,180};
        int [] puntosY27={350,360,360,350};
        tatiana.setColor(new Color(253,247,52));
        tatiana.fillPolygon(puntosX27,puntosY27,4);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX27,puntosY27,4);
        //Zapato derecho
        int [] puntosX28={180,180,190,200,200};
        int [] puntosY28={350,360,360,380,350};
        tatiana.fillPolygon(puntosX28,puntosY28,5);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX28,puntosY28,5);
        //Zapato derecho
        int [] puntosX29={250,270,280,280,270,250,280,300,310,310,300,280};
        int [] puntosY29={10,20,30,70,90,100,100,90,70,40,20,10};
        tatiana.setColor(new Color(254,247,52));
        tatiana.fillPolygon(puntosX29,puntosY29,12);
        tatiana.setColor(Color.BLACK);
        tatiana.drawPolygon(puntosX29,puntosY29,12);
}
    public static void main (String []args){
        JFrame ventana= new JFrame ("Graficas-Lineas");
        ColoresBruja objeto = new ColoresBruja();
        ventana.add(objeto);
        ventana.setSize(350,440);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
     


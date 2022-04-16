/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas2d;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Bruja extends JPanel {
    
    public void paint (Graphics tatiana){
        
        super.paint(tatiana);
       //Punta del sombrero 
       tatiana.drawLine(60, 120, 120, 10);
       tatiana.drawLine(120, 10, 160, 40);
       tatiana.drawLine(160, 40, 140, 40);
       tatiana.drawLine(140, 40, 180, 120);
       //Base del sombrero
       tatiana.drawLine(10, 120, 230, 120);
       tatiana.drawLine(230, 120, 230, 130);
       tatiana.drawLine(230, 130, 10, 130);
       tatiana.drawLine(10, 130, 10, 120);
       //Cinturon del sombrero
       tatiana.drawLine(80, 80, 100, 80);
       tatiana.drawLine(140, 80, 160, 80);
       tatiana.drawLine(70, 100, 100, 100);
       tatiana.drawLine(140, 100, 170, 100);
       tatiana.drawLine(100, 70, 140, 70);
       tatiana.drawLine(140, 70, 140, 110);
       tatiana.drawLine(140, 110, 100, 110);
       tatiana.drawLine(100, 110, 100, 70);
       tatiana.drawLine(110, 80, 130, 80);
       tatiana.drawLine(130, 80, 130, 100);
       tatiana.drawLine(130, 100, 110, 100);
       tatiana.drawLine(110, 100, 110, 80);
       //Cabello izquierdo
       tatiana.drawLine(60, 130, 0, 180);
       tatiana.drawLine(0, 180, 10, 190);
       tatiana.drawLine(10, 190, 40, 160);
       tatiana.drawLine(40, 160, 20, 190);
       tatiana.drawLine(20, 190, 30, 200);
       tatiana.drawLine(30, 200, 50, 170);
       tatiana.drawLine(50, 170, 40, 210);
       tatiana.drawLine(40, 210, 50, 220);
       tatiana.drawLine(50, 220, 80, 130);
       //Cabello derecho
       tatiana.drawLine(160, 130, 190, 220);
       tatiana.drawLine(190, 220, 200, 210);
       tatiana.drawLine(200, 210, 190, 170);
       tatiana.drawLine(190, 170, 210, 200);
       tatiana.drawLine(210, 200, 220, 190);
       tatiana.drawLine(220, 190, 200, 160);
       tatiana.drawLine(200, 160, 230, 190);
       tatiana.drawLine(230, 190, 240, 180);
       tatiana.drawLine(240, 180, 180, 130);
       //Pierna izquierda
       tatiana.drawLine(90, 330, 110, 370);
       tatiana.drawLine(110, 370,150, 370);
       tatiana.drawLine(150, 370,160, 390);
       tatiana.drawLine(160, 390,160, 360);
       tatiana.drawLine(160, 360, 120, 360);
       tatiana.drawLine(120, 360, 110, 330);
       tatiana.drawLine(130, 360, 130, 370);
       tatiana.drawLine(140, 360, 140, 370);
       //Pierna derecha
       tatiana.drawLine(130, 330, 150, 360);
       tatiana.drawLine(150, 360, 190, 360);
       tatiana.drawLine(190, 360, 200, 380);
       tatiana.drawLine(200, 380, 200, 350);
       tatiana.drawLine(200, 350, 160, 350);
       tatiana.drawLine(160, 350, 150, 330);
       tatiana.drawLine(170, 350, 170, 360);
       tatiana.drawLine(180, 350, 180, 360);
       //Tronco
       tatiana.drawLine(150, 240, 180, 320);
       tatiana.drawLine(180, 320, 180, 330);
       tatiana.drawLine(180, 330, 60, 330);
       tatiana.drawLine(60, 330, 60, 320);
       tatiana.drawLine(60, 320, 90, 240);
       //Ojo derecho
       tatiana.drawLine(130, 140, 160, 140);
       tatiana.drawLine(160, 140, 160, 170);
       tatiana.drawLine(110, 170, 130, 170);
       tatiana.drawLine(130, 170, 130, 140);
       tatiana.drawLine(130, 150, 150, 150);
       tatiana.drawLine(150, 150, 150, 170);
       //Ojo izquierdo
       tatiana.drawLine(80, 140, 110, 140);
       tatiana.drawLine(110, 140, 110, 170);
       tatiana.drawLine(110, 170, 80, 170);
       tatiana.drawLine(80, 170, 80, 140);
       tatiana.drawLine(90, 150, 110, 150);
       tatiana.drawLine(90, 150, 90, 170);
       //Nariz
       tatiana.drawLine(160, 170, 70, 170);
       tatiana.drawLine(70, 170, 70, 190);
       tatiana.drawLine(70, 190, 130, 190);
       //Boca
       tatiana.drawLine(90, 200, 90, 210);
       tatiana.drawLine(90, 210, 100, 220);
       tatiana.drawLine(100, 220, 140, 220);
       tatiana.drawLine(140, 220, 150, 210);
       tatiana.drawLine(150, 210, 150, 200);
       //Quijada
       tatiana.drawLine(60, 190, 60, 210);
       tatiana.drawLine(60, 210, 90, 240);
       tatiana.drawLine(90, 240, 150, 240);
       tatiana.drawLine(150, 240, 180, 210);
       tatiana.drawLine(180, 210, 180, 190);
       //Escoba derecha
       tatiana.drawLine(180, 320, 230, 320);
       tatiana.drawLine(230, 320, 230, 330);
       tatiana.drawLine(230, 330, 180, 330);
       tatiana.drawLine(230, 320, 240, 290);
       tatiana.drawLine(240, 290, 330, 290);
       tatiana.drawLine(330, 290, 330, 360);
       tatiana.drawLine(330, 360, 240, 360);
       tatiana.drawLine(240, 360, 230, 330);
       //Escoba izquierda
       tatiana.drawLine(60, 320, 10, 320);
       tatiana.drawLine(10, 320, 10, 330);
       tatiana.drawLine(10, 330, 60, 330);
       //Brazo derecho
       tatiana.drawLine(150, 240, 210, 230);
       tatiana.drawLine(210, 230, 210, 210);
       tatiana.drawLine(210, 210, 220, 210);
       tatiana.drawLine(220, 210, 220, 220);
       tatiana.drawLine(220, 220, 230, 210);
       tatiana.drawLine(230, 210, 240, 230);
       tatiana.drawLine(240, 230, 160, 270);
       tatiana.drawLine(210, 230, 220, 240);
       //Brazo izquierdo
       tatiana.drawLine(90, 240, 20, 310);
       tatiana.drawLine(20, 310, 20, 320);
       tatiana.drawLine(40, 320, 40, 310);
       tatiana.drawLine(40, 310, 80, 270);
       tatiana.drawLine(30, 300, 40, 310);
       //Luna
       tatiana.drawLine(250, 10, 270, 20);
       tatiana.drawLine(270, 20, 280, 30);
       tatiana.drawLine(280, 30, 280, 70);
       tatiana.drawLine(280, 70, 270, 90);
       tatiana.drawLine(270, 90, 250, 100);
       tatiana.drawLine(250, 100, 280, 100);
       tatiana.drawLine(280, 100, 300, 90);
       tatiana.drawLine(300, 90, 310, 70);
       tatiana.drawLine(310, 70, 310, 40);
       tatiana.drawLine(310, 40, 300, 20);
       tatiana.drawLine(300, 20, 280, 10);
       tatiana.drawLine(280, 10, 250, 10);
    }
    public static void main (String []args){
        JFrame ventana= new JFrame ("Graficas-Lineas");
        Bruja objeto = new Bruja();
        ventana.add(objeto);
        ventana.setSize(350,440);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

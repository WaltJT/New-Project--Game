/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author wjter
 */
public class Personaje {
    JLabel persona=new JLabel();
    
    public Personaje(int x, int y) { //Tamaño
        setTamano();
        URL url =getClass().getResource("01.png");
        ImageIcon imagen=new ImageIcon(url);
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(persona.getWidth(),persona.getHeight(),Image.SCALE_DEFAULT));
        persona.setIcon(icono);
        persona.repaint();
        setPosition(x, y);
        
    }
    
    public final void setPosition(int posX, int posY){
        persona.setLocation(posX, posY);
        
        
        
    }

    private void setTamano() {
        persona.setSize(300,500);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.*;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wjter
 */
public class panel {

    JFrame frame;
    JPanel pane;
    public panel (JFrame fram){
    frame=fram; 
    components();
    
    agregarPersonaje();
    componentesFrame();
    
    
    }

    private void components(){
        pane=new JPanel();
        GroupLayout grupo=new GroupLayout(pane);
        pane.setLayout(grupo);
        pane.setBackground(Color.RED);
        pane.setBounds(0,0,1000,600);
  
    
    }
   
    private void componentesFrame() {
        frame.getContentPane().add(pane);
    }
    
    private void agregarPersonaje() {
        Personaje perso=new Personaje(120,120);
        pane.add(perso.persona);
        
    
    }

    
}
 
            
                     

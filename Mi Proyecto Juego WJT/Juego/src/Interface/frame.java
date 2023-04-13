/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.*;
import java.awt.Color;
import javax.swing.JFrame;



/**
 *
 * @author wjter
 */
public class frame {
    JFrame frame;
    
    panel comp;
    
    public frame(){
        frame=new JFrame ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.orange);
        
        frame.getContentPane().setLayout(null);
        frame.setSize(1000,600);
        comp=new panel(frame);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
    }

    public static void main(String []a){
    frame n=new frame();
    
    }
}


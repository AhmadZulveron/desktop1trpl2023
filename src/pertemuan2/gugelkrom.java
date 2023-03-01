/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.awt.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author CHAD
 */
public class gugelkrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame gc = new JFrame("Google Chrome");
        Image ic = Toolkit.getDefaultToolkit().getImage("E:\\Google_Chrome_icon_(February_2022).svg.png");
        gc.setIconImage(ic);
        
        JLabel label = new JLabel();
        label.setText("Who's Using Chrome?");
        label.setBounds(400, 190, 200, 30);
        gc.add(label);
        
        JButton b = new JButton("Ini Foto");
        b.setBounds(400, 250, 200, 200);
        b.setBackground(Color.WHITE);
        gc.add(b);
        
        //Image imb = Toolkit.getDefaultToolkit().getImage("E:\\Profile Image\\Artboard1.png");
        
        gc.setBounds(250, 18, 300, 300);
        gc.setSize(1039, 780);
        gc.setLayout(null);
        gc.setVisible(true);
    }
    
}

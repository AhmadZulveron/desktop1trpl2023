/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author CHAD
 */
public class registrasiform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Registrasi");
        f.setSize(1020, 779);
        f.setBounds(260, 18, 1020, 779);
        f.setLayout(null);
        f.setVisible(true);
        
        JLabel label = new JLabel();
        label.setText("Form Register");
        label.setBounds(450, 100, 1000, 100);
        f.add(label);
        
        
    }
    
}

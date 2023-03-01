/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author CHAD
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Form 1");
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(80, 40, 700, 250);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(80, 100, 700, 250);
        j.setBackground(Color.yellow);
        j.add(password);
        
        JTextField usernameTXT = new JTextField();
        usernameTXT.setBounds(200, 150, 200, 30);
        j.add(usernameTXT);
        
        JTextField passwordTXT = new JTextField();
        passwordTXT.setBounds(200, 210, 200, 30);
        j.add(passwordTXT);
        
        JButton btnLogin = new JButton();
        btnLogin.setText("Login");
        btnLogin.setBounds(200, 280, 100, 30);
        j.add(btnLogin);
        
        JTextArea ta = new JTextArea();
        ta.setBounds(200, 340, 200, 200);
        j.add(ta);
        
        j.setSize(1980, 1080);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}

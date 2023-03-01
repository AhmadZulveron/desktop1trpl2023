/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.*;

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
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(80, 40, 700, 250);
        f.add(name);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(80, 100, 700, 250);
        f.add(username);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(80, 160, 700, 250);
        f.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No. Hp");
        nohp.setBounds(80, 220, 700, 250);
        f.add(nohp);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(80, 280, 700, 250);
        f.add(password);
        
        JTextField nameTXT = new JTextField();
        nameTXT.setBounds(200, 150, 200, 30);
        f.add(nameTXT);
        
        JTextField usernameTXT = new JTextField();
        usernameTXT.setBounds(200, 210, 200, 30);
        f.add(usernameTXT);
        
        JTextField emailTXT = new JTextField();
        emailTXT.setBounds(200, 270, 200, 30);
        f.add(emailTXT);
        
        JTextField nohpTXT = new JTextField();
        nohpTXT.setBounds(200, 330, 200, 30);
        f.add(nohpTXT);
        
        JPasswordField passwordTXT = new JPasswordField();
        passwordTXT.setBounds(200, 390, 200, 30);
        f.add(passwordTXT);
        
        JButton btnRegist = new JButton();
        btnRegist.setText("Register");
        btnRegist.setBounds(200, 450, 100, 30);
        f.add(btnRegist);
    }
    
}

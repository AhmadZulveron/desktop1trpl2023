/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author CHAD
 */
public class FormRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame rf = new JFrame("Register");
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(80, 40, 700, 250);
        rf.add(name);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(80, 100, 700, 250);
        rf.add(username);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(80, 160, 700, 250);
        rf.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No. Hp");
        nohp.setBounds(80, 220, 700, 250);
        rf.add(nohp);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(80, 280, 700, 250);
        rf.add(password);
        
        JTextField nameTXT = new JTextField();
        nameTXT.setBounds(200, 150, 200, 30);
        rf.add(nameTXT);
        
        JTextField usernameTXT = new JTextField();
        usernameTXT.setBounds(200, 210, 200, 30);
        rf.add(usernameTXT);
        
        JTextField emailTXT = new JTextField();
        emailTXT.setBounds(200, 270, 200, 30);
        rf.add(emailTXT);
        
        JTextField nohpTXT = new JTextField();
        nohpTXT.setBounds(200, 330, 200, 30);
        rf.add(nohpTXT);
        
        JPasswordField passwordTXT = new JPasswordField();
        passwordTXT.setBounds(200, 390, 200, 30);
        rf.add(passwordTXT);
        
        JButton btnRegist = new JButton();
        btnRegist.setText("Register");
        btnRegist.setBounds(200, 450, 100, 30);
        rf.add(btnRegist);
        
        rf.setSize(1980, 1080);
        rf.setLayout(null);
        rf.setVisible(true);
    }
    
}

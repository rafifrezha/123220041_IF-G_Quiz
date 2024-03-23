/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifg_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class login extends JFrame implements ActionListener{
    JLabel judul = new JLabel("KUIS PEMROGRAMAN BERORIENTASI OBJEK");
    JLabel user = new JLabel("Username :");
    JTextField inputuser = new JTextField();
    JLabel pw = new JLabel("Password :");
    JPasswordField inputpw;
    JButton log = new JButton("Login");
    
    login(){
        setVisible(true);
        setSize(580, 650);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(30, 10, 500, 50);
        judul.setFont (judul.getFont().deriveFont(20.0f));
      
        add(user);
        user.setBounds(30, 100, 300, 32);
        user.setFont (user.getFont().deriveFont(16.0f));
        add(inputuser);
        inputuser.setBounds(30, 130, 430, 32);
        inputuser.setFont (inputuser.getFont().deriveFont(16.0f));
        
        add(pw);
        pw.setBounds(30, 180, 300, 32);
        pw.setFont (pw.getFont().deriveFont(16.0f));
        
        inputpw = new JPasswordField();
        inputpw.setBounds(30, 210, 430, 32);
        add(inputpw);
        
        
        add(log);
        log.setBounds(30, 320, 430, 32);
        log.setFont (log.getFont().deriveFont(16.0f));
        log.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inputuser.getText().isEmpty() || inputpw.getText().isEmpty()) {
            
        JOptionPane.showMessageDialog(this, "Lengkapi semua inputan !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        try {
            
            String username = inputuser.getText();
            if (username.isEmpty()) {
                throw new Exception("Tidak Boleh Kosong");
            }
            new menuUtama();
            this.dispose();
        } catch (Exception error) {
        }
    }
}

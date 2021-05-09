/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3praktikum;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author mumta
 */

public class Main {
    public static void main(String[] args){
        
        GUI g = new GUI();
        g.setSize(700, 600);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }

}


class GUI extends JFrame implements ActionListener {
    
    JLabel perintah = new JLabel("Masukkan Data-Data yang diminta : ");
    
    JLabel jPanjang = new JLabel("Input Panjang : ");
    final JTextField fPanjang = new JTextField(5);
    
    JLabel jLebar = new JLabel("Input Lebar : ");
    final JTextField fLebar = new JTextField(5);
    
    JLabel jTinggi = new JLabel("Input Tinggi : ");
    final JTextField fTinggi = new JTextField(5);
    
    JButton hasil = new JButton("Hasil Perhitungan : ");
    
    JLabel keliling = new JLabel();
    JLabel luas = new JLabel();
    JLabel luasPerm = new JLabel();
    JLabel volume = new JLabel();
    
    JButton submit = new JButton("Hitung");
    
    JButton reset = new JButton("Reset");
    
    public GUI(){
    setTitle("Tugas 3 Praktikum PBO 123190042 | Kalkulator bidang ruang");
    setLayout(null);
    
    add(perintah);
    add(jPanjang);
    add(fPanjang);
    add(jLebar);
    add(fLebar);
    add(jTinggi);
    add(fTinggi);
    add(hasil);
    add(submit);
    add(reset);
    
    perintah.setBounds(45,10,200,20);
    
    jPanjang.setBounds(45,30,120,20);
    fPanjang.setBounds(130, 30, 150, 20);
    
    jLebar.setBounds(45,60,120,20);
    fLebar.setBounds(130, 60, 150, 20);
    
    jTinggi.setBounds(45,90,120,20);
    fTinggi.setBounds(130, 90, 150, 20);
    
    submit.setBounds(70, 300, 100, 20);
    
    reset.setBounds(180, 300, 100, 20);
    
    hasil.setBounds(75,130,200,40);
    
    submit.addActionListener(this);
    reset.addActionListener(this);
    
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        }
    
    public void actionPerformed (ActionEvent a){
        if(a.getSource() == submit){
           try{
            double panjang,lebar,tinggi;
            panjang = Double.parseDouble(fPanjang.getText()); 
            lebar = Double.parseDouble(fLebar.getText());
            tinggi = Double.parseDouble(fTinggi.getText());
            Balok balok = new Balok(panjang,lebar,tinggi);
            balok.setPanjang(panjang);
            balok.setLebar(lebar);
            balok.setTinggi(tinggi);
            
            
            keliling.setText("Keliling Persegi Panjang : "+ Double.toString(balok.hitungKeliling()));
            add(keliling);
            keliling.setBounds(45,190,200,20);
            
            luas.setText("Luas Persegi Panjang : "+ Double.toString(balok.hitungLuas()));
            add(luas);
            luas.setBounds(45,210,250,20);
           
            luasPerm.setText("Luas Permukaan Balok  : "+ Double.toString(balok.hitungLuasPermukaan()));
            add(luasPerm);
            luasPerm.setBounds(45,230,250,20);
            
            volume.setText("Volume Balok  : "+ Double.toString(balok.hitungVolume()));
            add(volume);
            volume.setBounds(45,250,180,20);
           }
           
           
           catch(NumberFormatException n)
           {
             JOptionPane.showMessageDialog(null,"" + n.getMessage());
             }
           } 
        
        if(a.getSource() == reset){
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            keliling.setText(null);
            luas.setText(null);
            luasPerm.setText(null);
            volume.setText(null);
        }
    }
    
    
    }
    



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3praktikum;

/**
 *
 * @author mumta
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{

    double tinggi;

    public Balok(double panjang, double lebar, double inputTinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.tinggi = tinggi;
    }

    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }
    
    
    @Override   
    public double hitungVolume(){
        return panjang*lebar*tinggi;
    }

    @Override
    public double hitungLuasPermukaan(){
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    
    

}

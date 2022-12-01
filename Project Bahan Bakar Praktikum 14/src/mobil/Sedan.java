/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
import bensin.BensinPerLiter;

/**
 *
 * @author Lenovo
 */
public class Sedan extends BensinPerLiter {
    
    @Override
    public double hitungBensin(){
        double totalBensin = this.jarak / 10;
        return Math.round(totalBensin);
    }
    
    @Override
    public void hitungLamaWaktu(){
        double waktu = this.jarak / this.kecepatan;
        double menit = Math.round((waktu - (int)waktu) * 60);
        int jam = (int)waktu;
        System.out.println("Lama Waktu = " +jam+ " jam " + menit + " menit");
        System.out.println("------------------------------");
    }
    
    @Override
    public String mobil(){
        String mobil = "SEDAN";
        return mobil;
    }
}

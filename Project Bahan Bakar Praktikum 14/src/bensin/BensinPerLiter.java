/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bensin;

/**
 *
 * @author Lenovo
 */
public abstract class BensinPerLiter {
    public abstract double hitungBensin();
    public abstract String mobil();
    public String lokasiAwal,lokasiTujuan;
    public abstract void hitungLamaWaktu();
    public String nama;
    public double jarak;
    public double kecepatan;
    public void tampilKan(){
        System.out.println("Nama Mobil = " + this.nama);
        System.out.println("Tipe Mobil = " + this.mobil());
        System.out.println("Rute = " + this.lokasiAwal+" - "+ this.lokasiTujuan);
        System.out.println("Jarak = " + this.jarak + " Km");
        System.out.println("Kecepatan = " +this.kecepatan + " Km/Jam");
        System.out.println("Bensin Yang Diperlukan = " + this.hitungBensin() + " Liter");
    }
}

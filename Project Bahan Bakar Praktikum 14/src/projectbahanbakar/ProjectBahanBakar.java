/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbahanbakar;
import mobil.Mpv;
import mobil.Sedan;
import mobil.Suv;

/**
 *
 * @author Lenovo
 */
public class ProjectBahanBakar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Sedan se1 = new Sedan();
        se1.nama = "A";
        se1.lokasiAwal = "Solo";
        se1.lokasiTujuan = "Kudus";
        se1.jarak = 105;
        se1.kecepatan = 60;
        se1.mobil();
        se1.hitungBensin();
        se1.tampilKan();
        se1.hitungLamaWaktu();
        
        Sedan se2 = new Sedan();
        se2.nama = "B";
        se2.lokasiAwal = "Solo";
        se2.lokasiTujuan = "Jakarta";
        se2.jarak = 565;
        se2.kecepatan = 65;
        se2.mobil();
        se2.hitungBensin();
        se2.tampilKan();
        se2.hitungLamaWaktu();
        
        Suv s1 = new Suv();
        s1.nama = "C";
        s1.lokasiAwal = "Solo";
        s1.lokasiTujuan = "Banten";
        s1.jarak =  681 ;
        s1.kecepatan = 57;
        s1.mobil();
        s1.hitungBensin();
        s1.tampilKan();
        s1.hitungLamaWaktu();
        
        Suv s2 = new Suv();
        s2.nama = "D";
        s2.lokasiAwal = "Solo";
        s2.lokasiTujuan = "Bandung";
        s2.jarak = 459;
        s2.kecepatan = 62;
        s2.mobil();
        s2.hitungBensin();
        s2.tampilKan();
        s2.hitungLamaWaktu();
        
        
        Mpv m1 = new Mpv();
        m1.nama = "E";
        m1.lokasiAwal = "Solo";
        m1.lokasiTujuan = "Banyuwangi";
        m1.jarak = 504;
        m1.kecepatan = 64;
        m1.mobil();
        m1.hitungBensin();
        m1.tampilKan();
        m1.hitungLamaWaktu();
        
        
        Mpv m2 = new Mpv();
        m2.nama = "F";
        m2.lokasiAwal = "Solo";
        m2.lokasiTujuan = "Jember";
        m2.jarak = 408;
        m2.kecepatan = 53;
        m2.mobil();
        m2.hitungBensin();
        m2.tampilKan();
        m2.hitungLamaWaktu();
        
        
        
       
        
    }
    
}

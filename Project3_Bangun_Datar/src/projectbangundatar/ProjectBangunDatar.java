/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Lenovo
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegi A = new persegi();
        persegi B = new persegi();
        persegi C = new persegi();
        persegi D = new persegi();
        
        A.panjang = 10;
        A.lebar = 7;
        B.panjang = 14;
        B.lebar = 9;
        C.panjang = 17 ;
        C.lebar = 18;
        D.panjang = 26;
        D.lebar = 14;
        
        
        System.out.println("Persegi A");
        A.hitungluas();
        A.hitungkeliling();
        System.out.println("");
        System.out.println("Persegi B");
        B.hitungluas();
        B.hitungkeliling();
        System.out.println("");
        System.out.println("Persegi C");
        C.hitungluas();
        C.hitungkeliling();
        System.out.println("");
        System.out.println("Persegi D");
        D.hitungluas();
        D.hitungkeliling();
        System.out.println("");
        
//        Lingkaran
        
        lingkaran L1 = new lingkaran();
        lingkaran L2 = new lingkaran();
        
        L1.jejari = 6;
        L2.jejari = 12;
        
        System.out.println("Lingkaran L1");
        L1.hitungLuas();
        L1.hitungKeliling();
        System.out.println("");
        System.out.println("Lingkaran L2");
        L2.hitungLuas();
        L2.hitungKeliling();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Lenovo
 */
public class lingkaran {
    int jejari;
    double luas;
    double keliling;
    
    void hitungLuas(){
        luas = 22/7 * jejari * jejari;
        System.out.println("Luas : " + luas);
    }
    
    void hitungKeliling(){
        keliling = jejari* 22/7;
        System.out.println("Keliling : " + keliling);
    }
}

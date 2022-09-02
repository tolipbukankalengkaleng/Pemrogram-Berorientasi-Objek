/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Lenovo
 */
public class persegi {
    int panjang;
    int lebar;
    
    void hitungluas(){
        int luas = this.panjang * this.lebar ;
        System.out.println("Luas : " + luas);
    }
    
    void hitungkeliling(){
        int keliling = 2*(this.panjang + this.lebar);
        System.out.println("Keliling : " + keliling);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author rizky
 */
public class PersegiPanjang {
    float panjang;
    float lebar;
    
   public void luas(){
        System.out.println("Luas Persegi Panjang : " + this.panjang * this.lebar);
    }
    
    public void keliling(){
        System.out.println("Keliling Persegi Panjang : " + 2 * this.panjang + 2 * this.lebar  );
    }
}

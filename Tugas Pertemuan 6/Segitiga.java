/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author rizky
 */
public class Segitiga {
    float alas;
    float tinggi;
    float panjang1;
    float panjang2;
    float panjang3;
    
    public void luas(){
        System.out.println("Luas Segitiga : " + (this.alas * this.tinggi) / 2 );
    }
    
    public void keliling(){
        System.out.println("Keliling Persegi Panjang : " + this.panjang1 + this.panjang2 + this.panjang3);
    }
}

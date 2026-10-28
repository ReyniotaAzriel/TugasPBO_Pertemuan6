/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author rizky
 */
public class Lingkaran extends BangunDatar {
    float jari;
    double phi = 3.14;
    
    public void luas(){
        System.out.println("Luas Lingkaran : " + phi * this.jari * this.jari);
    }
    
    public void keliling(){
        System.out.println("Keliling Lingkaran : " + 2 * this.jari * 3.14 );
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author rizky
 */

public class Persegi extends BangunDatar {
    float sisi;
    
    public void luas(){
        System.out.println("Luas Persegi : " + this.sisi * this.sisi);
    }
    
    public void keliling(){
        
        System.out.println("Keliling Persegi : " + this.sisi * 4);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;


/**
 *
 * @author rizky
 */
public class Main {
    public static void main(String[] args) {
        //general = super class, Spesifik = sub-class
//        Employee em1 = new Employee(123, "arif edan pisan", 2000000);
//        em1.nip = 1234;
//        em1.nama = "Arif Edan";
//        em1.gaji = 200000;
//        em1.info();
//        
//        Staff s1 = new Staff(5432, "arif edan te katulung", 100000, "KACUNG");
////        s1.nip = 1234;
////        s1.nama = "Arif edan eling";
////        s1.gaji = 300000;
////        s1.bagian = "OB";
//        s1.info();
//        s1.infoBagian();

        //Luas dan Keliling Persegi
        Persegi p1 = new Persegi();
        p1.sisi = 4;
        System.out.println("Luas dan Keliling Persegi : ");
        p1.luas();
        p1.keliling();
        System.out.println("");

        //Luas dan Keliling persegi panjang
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 10;
        System.out.println("Luas dan Keliling Persegi Panjang : ");
        pp1.luas();
        pp1.keliling();
        System.out.println("");
        
        //Luas dan Keliling Lingkaran
        Lingkaran L1 = new Lingkaran();
        L1.jari = 12;
        System.out.println("Luas dan Keliling Lingkaran : ");
        L1.luas();
        L1.keliling();
        System.out.println("");
        
        //Luas dan Keliling Segitiga
        Segitiga S1 = new Segitiga();
        S1.alas = 5;
        S1.tinggi = 10;
        S1.panjang1 = 7;
        S1.panjang2 = 9;
        S1.panjang3 = 11;
        System.out.println("Luas dan Keliling Segitiga : ");
        S1.luas();
        S1.keliling();
        
        
        
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author Muhammad Noor Ichwan
 */
public class hero {
    String name;
    String spesialist;
    String role;
    String pasif;
    String sinergy;
    String laning;
    int jumlahHP;
    int jumlahMana;

    void ketHero(){
        System.out.println("Nama Hero\t:"+name);
        System.out.println("Spesialist\t:"+spesialist);
        System.out.println("Role      \t:"+role);
        System.out.println("Pasif     \t:"+pasif);
        System.out.println("Sinergy   \t:"+sinergy);
        System.out.println("Laning Map\t:"+laning);
        System.out.println("Jumlah HP\t:"+jumlahHP);
        System.out.println("Jumlah Mana\t:"+jumlahMana);
    }

    void kenaDamage(int jumlahDamage){
        System.out.println(name+" Terkena Damage Sebesar "+jumlahDamage);
        jumlahHP= jumlahHP-jumlahDamage;
        System.out.println("Jumlah HP Hero Saat ini adalah\t "+jumlahHP);
    }
}

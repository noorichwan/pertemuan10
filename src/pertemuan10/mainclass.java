/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 * Class ini adalah main class dari class hero dan item, jadi fungsi class ini untuk menciptakan object dari class hero dan item.
 * class ini berfungsi untuk running programnya agar bisa melihat outputan nya.
 * Pada class ini terdiri dari 2 constructor, constructor pickhero dan itemhero.
 *
 * @author Muhammad Noor Ichwan
 */
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main Method yang digunakan untuk running
       hero pickhero = new hero();//constructor ke 1
        pickhero.name="Estes";
        pickhero.spesialist="Healing";
        pickhero.role="Support";
        pickhero.pasif=(4);
        pickhero.sinergy="Elf";
        pickhero.laning="Roamer";
        pickhero.jumlahHP=(7000);
        pickhero.jumlahMana=(4000);
        pickhero.ketHero();
        pickhero.kenaDamage(780);
        pickhero.skill("Skill 1",300);
        pickhero.healing(100);
        hero uranus = new hero(7000, 4000);
        hero pharsa = new hero("Estes","Healing","Support");
        //Ini Saya nonaktifkan karena sama saja dengan yang diatas
        //Bedanya ini hanya lanjutan sama beda angka
        //pickhero.kenaDamage(450);
        //pickhero.skill("Skill 2",600);
        //pickhero.healing(300);
        //pickhero.kenaDamage(4050);
        //pickhero.skill("Skill 3",3800);
        //pickhero.healing(1000);
        item itemhero = new item();//Constructor ke 2
        itemhero.nameItem="Oracle";
        itemhero.fungsiItem="Bisa menambahkan 500 gold diawal pembelian";
        itemhero.pasifItem="Menambahkan Regen Mana";
        itemhero.jumlahMana=(4000);
        itemhero.ketItem();
        itemhero.aktifPasifItem();
        
 
    }
        // TODO code application logic here
    }
    

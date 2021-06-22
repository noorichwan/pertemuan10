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
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       hero pickhero = new hero();
        pickhero.name="Aurora";
        pickhero.spesialist="Crownd Control";
        pickhero.role="Mage";
        pickhero.pasif="Membekukan Musuh Saat Terkumpul 4 Stak";
        pickhero.sinergy="Northen Vale";
        pickhero.laning="Midlaner";
        pickhero.jumlahHP=(7000);
        pickhero.jumlahMana=(4000);
        pickhero.ketHero();
        pickhero.kenaDamage(780);
        pickhero.kenaDamage(450);
    }
        // TODO code application logic here
    }
    

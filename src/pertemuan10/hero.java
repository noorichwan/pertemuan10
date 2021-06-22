/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *Sebuah Class yang terdiri dari 8 atribut, dan 20 method (termasuk setter dan getter yang berjumlah 16)
 * @author Muhammad Noor Ichwan
 */
public class hero { //8 Atribut
    String name;
    String spesialist;
    String role;
    int pasif;
    String sinergy;
    String laning;
    int jumlahHP;
    int jumlahMana;

    //setter disini saya membuatnya menggunakan insert code lalu klik setter dan getter
    public void setName(String name) {
        this.name = name;
    }

    public void setSpesialist(String spesialist) {
        this.spesialist = spesialist;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPasif(int pasif) {
        this.pasif = pasif;
    }

    public void setSinergy(String sinergy) {
        this.sinergy = sinergy;
    }

    public void setLaning(String laning) {
        this.laning = laning;
    }

    public void setJumlahHP(int jumlahHP) {
        this.jumlahHP = jumlahHP;
    }

    public void setJumlahMana(int jumlahMana) {
        this.jumlahMana = jumlahMana;
    }

    //getter disini saya membuatnya menggunakan insert code lalu klik setter dan getter
    public String getName() {
        return name;
    }

    public String getSpesialist() {
        return spesialist;
    }

    public String getRole() {
        return role;
    }

    public int getPasif() {
        return pasif;
    }

    public String getSinergy() {
        return sinergy;
    }

    public String getLaning() {
        return laning;
    }

    public int getJumlahHP() {
        return jumlahHP;
    }

    public int getJumlahMana() {
        return jumlahMana;
    }

    public void ketHero(){ 
        //Method pertama ini berfungsi untuk menampilkan keterangan Hero nya. 
        //Method ini digunakan untuk output yang sudah diisi di mainclass
        System.out.println("Pemilihan Hero:");
        System.out.println("Nama Hero\t:"+name);
        System.out.println("Spesialist\t:"+spesialist);
        System.out.println("Role      \t:"+role);
        System.out.println("Pasif     \t:"+pasif);
        System.out.println("Sinergy   \t:"+sinergy);
        System.out.println("Laning Map\t:"+laning);
        System.out.println("Jumlah HP\t:"+jumlahHP);
        System.out.println("Jumlah Mana\t:"+jumlahMana);
    }

    public void kenaDamage(int jumlahDamage){ 
        //Method ini digunakan ketika hero terkena damage yang membuat jumlah HP nya berkurang dengan menggunakan rumus seperti dibawah
        System.out.println(name+" Terkena Damage Sebesar         \t "+jumlahDamage);
        jumlahHP= jumlahHP-jumlahDamage;
        System.out.println("Jumlah HP Hero Saat ini adalah       \t "+jumlahHP);
    }
    
    public void healing(int jumlahHealing){ 
        //Method ini digunakan untuk menambah HP dari hero, dengan memasukkan rumus seperti dibawah
        System.out.println(name+" Mendapatkan Healing sebesar    \t"+jumlahHealing);
        jumlahHP = jumlahHP + jumlahHealing;
        System.out.println("Jumlah HP Saat Ini                   \t"+jumlahHP);
    }
    
    public void skill(String skill, int mana){ 
        //Method ini menggunakan if else untuk melakukan penggunaan skill.
        //Jika menggunakan skill maka akan mengurangi mana hero dengan memasukkan rumus seperti dibawah
        //Tapi jika Mana skill lebih besar dari pada jumlah mana, maka hasil print akan mencetak(mana tidak cukup, harap isi mana anda)
        if (mana > jumlahMana){
        System.out.println("Mana Tidak Cukup, Harap isi Mana Anda");
        }else{
        System.out.println(name+" menggunakan "+skill+" dengan mana :\t"+mana);
        jumlahMana=jumlahMana-mana;
        System.out.println("Jumlah mana saat ini:                  \t"+jumlahMana);
        }
    }
    
    public float getDamage(int DamageHero){
        //ini penggunaan overriding. saya minta maaf terlebih dahulu
        //saya sudah mencoba melakukan overriding, dibagian class ini tidak terjadi error
        //tapi malah terjadi error pada class java saat saya melakukan pemanggilan
        return (float) (2000*2-jumlahMana);
    }
    
    public hero(){ //Constructor 
        System.out.println("============================================================");
        System.out.println("                 Welcome To Mobile Legends");
        System.out.println("Pemilihan Hero dan Item Belum Bisa Dilakukan Secara Otomatis");
        System.out.println("============================================================");
    }
}

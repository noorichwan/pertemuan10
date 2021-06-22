/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 * pada class kedua ini bernama class item.
 * class item terdiri dari 9 atribut termasuk setter dan getter, dan 2 method.
 * @author Muhammad Noor Ichwan
 */
public class item extends hero{ //subclass dari class1(hero). extends disini berfungsi agar bisa memanggil kembali fungsi yang ada pada class hero
    String fungsiItem;
    String pasifItem;
    String nameItem;
    
    //Setter dari class2
    public void setFungsiItem(String fungsiItem) {
        this.fungsiItem = fungsiItem;
    }

    public void setPasifItem(String pasifItem) {
        this.pasifItem = pasifItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
    
    
    
    //getter dari class2
    public String getFungsiItem() {
        return fungsiItem;
    }

    public String getPasifItem() {
        return pasifItem;
    }

    public String getNameItem() {
        return nameItem;
    }
    
    public void ketItem(){//Method ini sama berfungsi seperti method ket
        System.out.println("Pemilihan Item:");
        System.out.println("Nama Item  : \t "+nameItem);
        System.out.println("funsiItem  : \t "+fungsiItem);
        System.out.println("Pasif Item : \t "+pasifItem);
    }
    
    public void aktifPasifItem(){//
        jumlahMana=jumlahMana + 400;
        System.out.println("Total Mana Sekarang Adalah "+jumlahMana);
    }
    
    /*public float DamageItem(){
        //Ini Overriding, tapi saya error jadi saya nonaktifkan
        //Saya Meminta maaf karena masih belum bisa melakukan overriding
        //Masih belum bisa, bukan tidak bisa.
        //Semoga jika diberikan waktu lebih lagi saya bisa mempelajari lebih lanjut
        return (float) (getDamage()*2.4);
    }*/

}

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
    
    public void ketItem(){//Method ini sama berfungsi seperti method ketHero
        System.out.println("Pemilihan Item:");
        System.out.println("Nama Item  : \t "+nameItem);
        System.out.println("funsiItem  : \t "+fungsiItem);
        System.out.println("Pasif Item : \t "+pasifItem);
    }
    
    public void aktifPasifItem(){//Method ini berfungsi menambakan jumlah mana dari class 1
        jumlahMana=jumlahMana + 400;
        System.out.println("Total Mana Sekarang Adalah "+jumlahMana);
    }

    @Override 
    public void setJumlahMana(int jumlahMana) {
        super.setJumlahMana(jumlahMana); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kenaDamage(int jumlahDamage) {
        super.kenaDamage(jumlahDamage); //To change body of generated methods, choose Tools | Templates.
    }
}

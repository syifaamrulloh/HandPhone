/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan55.handphone;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan spek HP konsep pewarisan class
 */
public class PBO11K10118910Latihan55Handphone {

    public static void main(String[] args) {
        
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("Android Key Store : "+a.getKeyStore());
        System.out.println("");
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("PIN : "+ b.getPinBB());
        System.out.println("");
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        w.setWpKeyStore("UUUQIJWORJ");
        w.displayProduct();
        System.out.println("Wp Key Store : "+ w.getWpKeyStore());
        
}
    
}

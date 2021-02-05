/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-01
 */
public class Main {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objek pemanggilan
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        //inisialisasi 1
        System.out.println("Tampilkan Pohon Cemara " );
        cemara.setNama();
        cemara.setTinggi();
        cemara.getNama();
        cemara.getTinggi();
        System.out.println("");
        //inisialisasi 2
        System.out.println("Tampilkan Pohon Kelapa " );
        kelapa.setNama();
        kelapa.setTinggi();
        kelapa.getNama();
        kelapa.getTinggi();
        System.out.println("");
           
    }
    
}

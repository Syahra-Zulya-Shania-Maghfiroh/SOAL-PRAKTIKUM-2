
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-01
 */
public class Pohon {
    //input user
    Scanner input = new Scanner(System.in);
    //mendefinisikan variabel
    String nama;
    int tinggi;
    //method input dari user
    void setNama(){
        System.out.print("Masukkan jenis pohon : ");
        nama = input.nextLine();
    }
    //method input dari user
    void setTinggi(){
        System.out.print("Masukkan tinggi pohon : ");
        tinggi = input.nextInt();
    }
    //method pengembalian
    public String getNama(){
        return nama;
    }
    //method pengembalian
    public int getTinggi(){
        return tinggi;
    }
    
    
}

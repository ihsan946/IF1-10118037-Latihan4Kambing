/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan4kambing;

/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program banyaknya Kambing.
 *                       
 */
public class IF110118037Latihan4Kambing {
    private static Object kambingJantan;

    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : "
                + jumlahKambing);
    }
    public static void main(String[] args) {
       IF110118037Latihan4Kambing kambingJantan = new IF110118037Latihan4Kambing();
       kambingJantan.tambahKambing();
    }
    
}

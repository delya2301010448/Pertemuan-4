/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan402;

/**
 *
 * @author Delya Sintya
 * tanggal 25 maret 2025
 */
public class Pertemuan402 {
    public static String[][] meja = new String[2][2];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        meja[0][0] = "data baris 0 kolom 0";
        meja[0][1] = "data baris 0 kolom 1"; 
        
        meja[1][0] = "data baris 1 kolom 0";
        meja[1][1] = "data baris 1 kolom 1"; 
        
        for(int baris=0;baris<2;baris++){
            for(int kolom=0;kolom<2;kolom++){
                 System.out.println("Posisi "+baris+":"+kolom+" = "+ meja[baris][kolom]);
            }
        }
    }
    
}

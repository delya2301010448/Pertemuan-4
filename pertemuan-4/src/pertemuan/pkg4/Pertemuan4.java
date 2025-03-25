/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg4;

import java.util.Scanner;

/**
 *
 * @author Delya Sintya
 * tgl : 25 maret 2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] nama = new String[6];
        
        for(int y=0;y<6;y++){
            System.out.print("Isi Data Teman: ");
            nama[y] = inp.nextLine();
        }
        
   
       for(int i=0;i<nama.length;i++){
           System.out.println("Data ke-"+(i+1)+": "+nama[i] );
       }
       for(String Hugo : nama){
           System.out.println(Hugo);
       }
    }
    
}

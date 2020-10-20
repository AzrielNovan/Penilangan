/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ProgramPenilangan {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // array
        String[] Tilangan = {"Masker","SIM"};
        int pilihan, pilih;
        //perulangan
    System.out.println("Pilih Operator Tipe Tilangan Sesuai Nomor");
    for (int i = 0; i < Tilangan.length; i++){
        System.out.println(+i+"."+ Tilangan[i]);
    }
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan pilihan :");
    pilihan = input.nextInt();
    //percabangan swicth case
    switch (pilihan){
        case 0 :
            System.out.println("Membawa Masker Atau Tidak");
            System.out.println("Membawa(1)");
            System.out.println("Tidak Membawa(2)");
            pilih = input.nextInt();
            if (pilih == 1){
                System.out.println("Silahkan Jalan");
            }else{
                System.out.println("Silahkan Sapu Jalan Atau Denda 100.000");
            }
            break;
        case 1 :
            System.out.println("Membawa SIM Atau Tidak");
            System.out.println("Membawa(1)");
            System.out.println("Tidak Membawa(2)");
            pilih = input.nextInt();
            if (pilih == 1){
                System.out.println("SIM Anda Kami Tahan");
            }else{
                System.out.println("Apa Anda Membawa STNK");
                System.out.println("STNK Anda Kami Tahan Serta Denda 50.000");
            }
            
    }
        
    }
    
}
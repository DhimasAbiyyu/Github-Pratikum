package pesan_tiket;

import java.util.Scanner;

public class Pesan_Tiket
{
   public static void main (String[] args)
   {
    Scanner input=new Scanner(System.in);

    System.out.println("Masukkan Jumlah Tiket: ");
    int n=input.nextInt();

    String namaFilm[]=new String[n];
    String noKursi[]=new String[n];

    for (int i=0;i<n;i++){
         System.out.println("Tiket Ke : "+(i+1));
        System.out.print("Nama Film : ");
        namaFilm[i]=input.next();

        System.out.print("No Kursi : ");
        noKursi[i]=input.next();
    }
    
    System.out.println("DAFTAR PEMESANAN TIKET");
    System.out.println("======================");
    System.out.println("No   Nama   NoKursi  ");
    
    for (int i=0; i<n;i++) {
        System.out.println((i+1)+"    "+namaFilm[i]+"    "+noKursi[i]);
    }
    
    }
 }


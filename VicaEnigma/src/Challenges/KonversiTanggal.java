package Challenges;

import java.util.Scanner;
public class KonversiTanggal{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int tanggal = scan.nextInt();
        int bulan = scan.nextInt();
        int tahun = scan.nextInt();

        switch(bulan){
            case 1 -> System.out.println(tanggal + " Januari " + tahun);
            case 2 -> System.out.println(tanggal + " Februari " + tahun);
            case 3 -> System.out.println(tanggal + " Maret " + tahun);
            case 4 -> System.out.println(tanggal + " April " + tahun);
            case 5 -> System.out.println(tanggal + " Mei " + tahun);
            case 6 -> System.out.println(tanggal + " Juni " + tahun);
            case 7 -> System.out.println(tanggal + " Juli " + tahun);
            case 8 -> System.out.println(tanggal + " Agustus " + tahun);
            case 9 -> System.out.println(tanggal + " September " + tahun);
            case 10 -> System.out.println(tanggal + " Oktober " + tahun);
            case 11 -> System.out.println(tanggal + " November " + tahun);
            case 12 -> System.out.println(tanggal + " Desember " + tahun);

        }

    }
}
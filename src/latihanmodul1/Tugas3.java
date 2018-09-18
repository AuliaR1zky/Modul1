package latihanmodul1;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = masukan.next();
        System.out.print("NIS: ");
        int NIS = masukan.nextInt();
        System.out.print("Tempat Lahir: ");
        String tempatLahir = masukan.next();
        System.out.print("Tanggal Lahir ");
        int tanggalLahir = masukan.nextInt();
        System.out.print("Jenis kelamin: ");
        String jenisKelamin = masukan.next();
        System.out.print("Alamat di Malang: ");
        String alamatDiMalang = masukan.next();
        System.out.println("Motto hidup: Kerja keras berawal dari NIAT");
        String mottoHidup = masukan.next();

    }
}

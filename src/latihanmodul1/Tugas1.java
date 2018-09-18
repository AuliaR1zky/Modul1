package latihanmodul1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Program penghitung luas permukaan bola\n\nMasukkan panjang jari jari bola: ");
        double r = masukan.nextDouble();
        final double phi1 = 3.14;
        final double phi2 = 22 / 7;
        System.out.println("rumus luas permukaan bola = 4 * phi * r * r");
        double hasil = 4 * phi2 * r * r;
        System.out.println("Luas permukaan bola = " + hasil);

    }
}

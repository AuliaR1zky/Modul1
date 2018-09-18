package latihanmodul1;

import java.util.Scanner;

public class PernyataanWhile {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a = 0, total = 7, bil = 7;
        while (bil != 0) {
            a++;
            System.out.print("Masukkan bilangan  ke-" + a + " :");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.print("Total Jumlah " + (a - 1) + " Bilangan:");
        System.out.println(total);
    }
}

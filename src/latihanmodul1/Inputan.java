package latihanmodul1;
import java.util.Scanner;
/**
 *
 * @author Kiki Aulia
 */
public class Inputan {
    public static void main (String[] args) {
        Scanner masukan = new Scanner (System.in);
        int a, b;
        System.out.print("Masukan nilai A: ");
        a = masukan.nextInt();
        System.out.print("Masukan nilai B: ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada pada program: ");
        System.out.println("a =" + a);
        System.out.println("b =" + b);
}
}
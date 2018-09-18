package latihanmodul1;

public class Tugas2 {
    public static void main(String[] args) {
        double suhu = 78;
        System.out.println("Program konversi suhu dari satuan celcius");
        System.out.println("=====================");
        double reamur = suhu * 4 / 5;
        double farenheit = (9/5*suhu) + 32;
        double kelvin = suhu + 273;
        System.out.println("Suhu = 78 derajat celcius");
        System.out.println("Suhu dalam reamur :\n78 derajat celcius: " + reamur + " derajat reamur");
        System.out.println("Suhu dalam farenheit :\n78 derajat celcius: " + farenheit + " derajat farenheit");
        System.out.println("Suhu dalam kelvin :\n78 derajat celcius: " + kelvin + "  derajat kelvin");
    }
}

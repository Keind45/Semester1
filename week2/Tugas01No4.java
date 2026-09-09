import java.util.Scanner;

public class Tugas01No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan panjang tanah: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan diameter kolam: ");
        double diameter = input.nextDouble();

        System.out.print("Masukkan sisi taman: ");
        double sisi = input.nextDouble();

        double luasTanah = lebar * panjang;

        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;

        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("\nLuas Tanah           : " + luasTanah + " m2");
        System.out.println("Luas Kolam           : " + luasKolam + " m2");
        System.out.println("Luas Taman           : " + luasTaman + " m2");
        System.out.println("Luas Tidak Digunakan : " + luasTidakDigunakan + " m2");

        input.close();
    }
}
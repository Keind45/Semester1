import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        int tiket, jmlTiket;
        double harga = 50000, diskon, totalHarga = 0, i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah pembeli tiket: ");
        tiket = sc.nextInt();

        while (i < tiket) {
            System.out.println("Masukkan jumlah tiket yang dibeli pembeli ke-" + (i + 1) + ": ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input jumlah tiket tidak valid");
                continue;
            }
            if (jmlTiket > 10) {
                diskon = 0.15;
                harga = jmlTiket * harga;
                totalHarga = harga - (harga * diskon);
            } else if (jmlTiket > 4) {
                diskon = 0.1;
                harga = jmlTiket * harga;
                totalHarga = harga - (harga * diskon);
            } else {
                diskon = 1;
                totalHarga = diskon * harga;
            }
            i++;
            System.out.println("Total harga tiket: " +totalHarga);   
        }
    }
}
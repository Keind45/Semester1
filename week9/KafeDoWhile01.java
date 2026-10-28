import java.util.Scanner;
public class KafeDoWhile01 {
    public static void main(String[] args) {
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        Scanner sc =  new Scanner(System.in);

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
               System.out.println("Transaksi dibatalkan.");
               break; 
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = sc.nextInt();

            totalHarga = ((kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti));
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
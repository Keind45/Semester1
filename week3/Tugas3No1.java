import java.util.Scanner;

public class Tugas3No1 {
    public static void main(String[] args) {
        int harga, uangMuka, Bulan, hargaAsli;
        double cicilan, jumlahBonus, bunga=0.02;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Harga: ");
        harga = sc.nextInt();
        System.out.println("Masukan Uang Muka: ");
        uangMuka = sc.nextInt();
        System.out.println("Masukan Lama Cicilan (Bulan): ");
        Bulan = sc.nextInt();

        hargaAsli = harga - uangMuka;
        jumlahBonus = hargaAsli * bunga  * Bulan;
        cicilan = (hargaAsli + jumlahBonus) / Bulan;
        System.out.println("Cicilan Bulanan: " + cicilan);
    }
}
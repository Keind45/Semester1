import java.util.Scanner;

public class StudiKasus101 {
    public static void main(String[] args) {
        int hargaPerCup = 18000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
if (uangBayar >= totalHarga) {
            if (totalHarga > 100000) {
                diskon = (int) (totalHarga * 0.1);
            }
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga: Rp." + totalHarga);
            System.out.println("Diskon: Rp." + diskon);
            System.out.println("Total bayar: Rp." + totalBayar);

            if (uangBayar >= totalBayar) {
                kembalian = uangBayar - totalBayar;
                System.out.println("Kembalian: Rp." + kembalian);
            } else {
                kurang = totalBayar - uangBayar;
                System.out.println("Uang yang dibayarkan kurang sebesar: Rp." + kurang);
            }
        }
    }
}
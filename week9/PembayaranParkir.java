import java.util.Scanner;
public class PembayaranParkir {
    public static void main(String[] args) {
        int jenis, durasi, total = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Pilih jenis kendaraan (1) untuk mobil, (2) untuk motor, (0) untuk keluar: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);
        System.out.println("Total biaya adalah: Rp " + total);
    }
}
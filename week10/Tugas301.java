import java.util.Scanner;

public class Tugas301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko harus > 0.");
        } else {
            int pelanggan;
            int totalBarang;
            int a = 0;
            int b = 0;
            int barangTerbanyak = 0;
            int i = 1;

            while (i <= jumlahToko) {
                System.out.println("Toko " + i);

                System.out.print("Pelanggan : ");
                pelanggan = sc.nextInt();

                System.out.print("Total barang : ");
                totalBarang = sc.nextInt();

                a += totalBarang;

                if (totalBarang > barangTerbanyak) {
                    barangTerbanyak = totalBarang;
                    b = i;
                }

                i++;

            }
            System.out.println("Total barang seluruh toko : " + a);
            System.out.println("Toko dengan barang terbanyak : " + b);

        }

        sc.close();
    }
}
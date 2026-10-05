import java.util.Scanner;

public class diskonTokoBuku {
    public static void main(String[] args) {
        String hari, jenis;
        double jumlah, diskon, diskontotal;

        Scanner  sc = new Scanner(System.in);

        System.out.println("Sekarang hari apa: (senin, selasa, rabu, kamis, jumat, sabtu, minggu): ");
        hari = sc.nextLine().trim();
        System.out.println("Jenis buku: (kamus, novel, lainya): ");
        jenis = sc.nextLine().trim();
        System.out.println("Jumlah buku yang di beli: ");
        jumlah = sc.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenis.equalsIgnoreCase("kamus")) {
                if (jumlah > 2) {
                    diskon = 0.12;
                } else {
                    diskon = 0.10;
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                if (jumlah > 3) {
                    diskon = 0.09;
                } else if (jumlah <= 3) {
                    diskon = 0.08;
                } else {
                    diskon = 0.07;
                }
            } else {
                    if(jumlah > 3) {
                        diskon = 0.05;
                    } else {
                        diskon = 0;
                    }
            }
        } else {
            diskon = 0;
        }
            diskontotal = 100 * diskon;
            System.out.println("Diskon anda adalah: " + diskontotal + "%");
    }
}
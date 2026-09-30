import java.util.Scanner;

public class diskonTokoBuku {
    public static void main(String[] args) {
        String hari, jenis, pesan = null;
        int jumlah;

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
                    pesan = "Diskon sebesar 12%";
                } else {
                    pesan = "Diskon sebesar 10%";
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                if (jumlah > 3) {
                    pesan = "Diskon sebesar 9%";
                } else if (jumlah <= 3) {
                    pesan = "Diskon sebesar 8%";
                } else {
                    pesan = "Diskon sebesar 7%";
                }
            } else {
                    if(jumlah > 3) {
                        pesan = "Diskon sebesar 5%";
                    } else {
                        pesan = "Tidak ada diskon bro";
                    }
            }
        } else {
            pesan = "Bukan hari rabu tidak ada diskon";
        }
            System.out.println(pesan);
    }
}
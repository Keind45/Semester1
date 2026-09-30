import java.util.Scanner;

public class nestedUjianSkripsi01 {
    public static void main(String[] args) {
        String pesan;

        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
            System.out.println(pesan);
    }
}
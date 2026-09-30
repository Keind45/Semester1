import java.util.Scanner;

public class tugas2SeleksiAsisten01 {
    public static void main(String[] args) {
        boolean mahasiswaAktif, dalamSanksi, sertifikat;
        int nilaiDaspro, wawancara;
        String pesan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah mahasiswa berstatus aktif (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sedang dalam sanksi akademik (true/false): ");
        dalamSanksi = sc.nextBoolean();
        System.out.println("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman (true/false): ");
        sertifikat = sc.nextBoolean();
        System.out.println("Berapa nilai daspro beliau: ");
        nilaiDaspro = sc.nextInt();
        System.out.println("Berapa nilai wawancara beliau: ");
        wawancara = sc.nextInt();

        if (mahasiswaAktif && !dalamSanksi) {
            if (nilaiDaspro >= 80 || sertifikat) {
                if (wawancara >= 75) {
                    pesan = "Anda di terima bro";
                } else {
                    pesan = "Maaf anda ditolak karna nilai wawancara anda kurang dari 75 bro";
                }
            } else {
                pesan = "Maaf anda ditolak karna nilai daspro anda kurang dari 80 dan anda juga tidak memiliki sertifikat bro";
            }
        } else {
            pesan = "Maaf anda ditolak karna anda bukan mahasiswa atau anda sedang dalam sanksi akademik bro";
        }
        System.out.println(pesan);
    }
}
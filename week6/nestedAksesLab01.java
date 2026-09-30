import java.util.Scanner;

public class nestedAksesLab01 {
    public static void main(String[] args) {
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        Scanner sc =  new Scanner(System.in);
        
        System.out.println("apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.println("apakah sedang di sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.println("apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.println("apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium di berikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
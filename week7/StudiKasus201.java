import java.util.Scanner;

public class StudiKasus201 {
    public static void main(String[] args) {
        String nama, kegiatan;
        int jumlahDokumen, peringkat, statusPendanaan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA) : ");
        kegiatan = sc.nextLine();
        System.out.println("Jumlah dokumen (0-4): ");
        jumlahDokumen = sc.nextInt();
        System.out.println("Peringkat juara : ");
        peringkat = sc.nextInt();
        System.out.println("Masukan status pendanaan (1 jika iya/ 0 jika tidak): ");
        statusPendanaan = sc.nextInt();

        
        System.out.println("Nama mahasiswa: " +nama);
        System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA): " +kegiatan);
        System.out.println("Jumlah dokumen: " +jumlahDokumen);
        System.out.println("Peringkat juara: " +peringkat);

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlahDokumen == 4) {
                String a = ("Jumlah dokumen " +jumlahDokumen);
                if (peringkat > 0 && peringkat < 4) {
                    System.out.println("Status : " +a + ", Dana penghargaan di berikan");
                } else {
                    System.out.println("Status : " +a + ", Dana penghargaan tidak di berikan");
                }
            } else {
                int jumlahKurang = 4 - jumlahDokumen;
                System.out.println("Status : Jumlah dokumen anda kurang " +jumlahKurang +" buah, pendanaan tidak di berikan");
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
        if (jumlahDokumen == 4) {
                if (statusPendanaan == 1) {
                    System.out.println("Status : Jumlah dokumen anda" +jumlahDokumen +", Pendanaan di berikan");
                } else {
                    System.out.println("Status : Jumlah dokumen anda" +jumlahDokumen + ", Pendanaan tidak di berikan");
                }
            } else {
                int jumlahKurang = 4 - jumlahDokumen;
                System.out.println("Status : Jumlah dokumen anda kurang " +jumlahKurang +" buah, pendanaan tidak di berikan");
            }
        } else {
            System.out.println("Maaf anda tidak ber hak mendapat pendanaan");
        }

    }
}
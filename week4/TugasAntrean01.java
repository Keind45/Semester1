import java.util.Scanner;

public class TugasAntrean01 {
    public static void main(String[] args) {
        char loket;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kode Locket: ");
        loket = sc.next().charAt(0);

        switch (loket) {
            case 'A','a':
                System.out.println("Locket A");
                System.out.println("Legalisir Ijazah");
                break;
            case 'B','b':
                System.out.println("Locket B");
                System.out.println("Surat Keterangan Aktif Kuliah");
                break;
            case 'C','c':
                System.out.println("Locket C");
                System.out.println("Pembayaran UKT");
                break;
            case 'D','d':
                System.out.println("Locket D");
                System.out.println("pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Locket tidak valid");
        }
    }
}
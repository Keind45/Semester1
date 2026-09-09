import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args) {
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah tabungan awal: ");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung: ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;

        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir adalah: " + jml_tabungan_akhir);
    }       
}
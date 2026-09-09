import java.util.Scanner;

public class MenghitungTotalBayar01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukan Harga: ");
        harga = sc.nextInt();
        System.out.println("Diskon: 15%");
        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp." + jml_bayar);

    }
}
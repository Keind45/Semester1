import java.util.Scanner;
public class SiakadFor01 {
    public static void main (String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        int totalLulus = 0, totalTidakLulus = 0;
        Scanner sc =  new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                totalLulus += + 1;
            } else {
                totalTidakLulus += 1;
            }
        }
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);
        System.out.println("Mahasiswa lulus: " +totalLulus);
        System.out.println("Mahasiswa tidak lulus: " +totalTidakLulus);
    }
}

//1. inisialisasi "i = 1", kondisi "i >= 10", proses"i++".
//2.supaya jika ada data baru masuk agar bisa jadi yang tertinggi dan terendah.
//3.if yang atas berfungsi untuk membandingkan nilai tertinggi dengan nilai baru untuk mencari nilai tertinggi, 
//dan yang bawah sama saja tetapi mencari yang terendah.
//4.DONEEE EZZ
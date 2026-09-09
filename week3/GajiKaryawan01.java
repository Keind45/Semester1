import java.util.Scanner;

public class GajiKaryawan01 {
    public static void main(String[] args) {
        int gajiPokok;
        double bonus, totalGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Gaji Pokok : ");
        gajiPokok = sc.nextInt();
        bonus = 0.05*gajiPokok;
        totalGaji = gajiPokok + bonus + tunjTransp + tunjMkn - (0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. " + (int)bonus);
        System.out.println("Gaji yang diterima adalah Rp." + (int)totalGaji);
    }
}
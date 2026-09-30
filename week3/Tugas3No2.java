import java.util.Scanner;

public class Tugas3No2 {
    public static void main(String[] args) {
        int lembar, jilid, biayaCetak = 500, biayaPerjilid = 5000, totalBiaya;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jumlah Lembar: ");
        lembar = sc.nextInt();
        System.out.println("Jumlah jilid: ");
        jilid = sc.nextInt();

        System.out.println("lembar: " + lembar);
        System.out.println("jilid: " + jilid);
        totalBiaya = (lembar * biayaCetak) + (jilid * biayaPerjilid);
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
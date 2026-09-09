import java.util.Scanner;

public class Tugas3No2 {
    public static void main(String[] args) {
        int lembar, jilid, biayaCetak = 500, biayaPerjilid = 5000, totalBiaya;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jumlah Lembar: ");
        lembar = sc.nextInt();
        System.out.println("Jumlah jilid: ");
        jilid = sc.nextInt();
        
        totalBiaya = (lembar * biayaCetak) + (jilid * biayaPerjilid);
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
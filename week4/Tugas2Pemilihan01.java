import java.util.Scanner;

public class Tugas2Pemilihan01 {
    public static void main(String[] args) {
        int jumlahSks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan jumlah sks: ");
        jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Output melebihi batas");
        } else  {
            System.out.println("KRS valid");
        }
    }
}
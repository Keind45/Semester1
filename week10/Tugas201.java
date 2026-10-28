import java.util.Scanner;
public class Tugas201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                int a = i * j;
                System.out.print(a + "\t");
                total += a;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + total);
        sc.close();
    }
}
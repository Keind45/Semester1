import java.util.Scanner;
public class Tugas101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        System.out.println("\nSegitiga Biasa:");
        int i = 1;
        int total = 0;
        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }

            total += i;
            i++;
            System.out.println("");
        }
        System.out.println("Total jumlah angka : " + total);
    }
}
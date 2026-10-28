
import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        System.out.println("\nSegitiga Biasa:");
        int i = 0;
        while (i <= n) {
            System.out.print("[i=" + i + "]");
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            i++;
            System.out.println("");
        }

        System.out.println("\nSegitiga Terbalik:");
        i = n;
        while (i >= 1) {
            System.out.print("[i=" + i + "]");
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            i--;
            System.out.println("");
        }

        sc.close();
    }
}
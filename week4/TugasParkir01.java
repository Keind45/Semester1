import java.util.Scanner;

public class TugasParkir01 {
    public static void main(String[] args) {
        int tarif = 2000;
        int jam;
        int total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Jam Parkir: ");
        jam = sc.nextInt();

        total = (jam - 2) * 1000 + tarif;

        if (jam >= 2) {
            System.out.println("tarif: Rp" +total);
        } else {
            System.out.println("tarif: Rp" +tarif);
        }
    }
}
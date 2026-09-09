import java.util.Scanner;

public class MenghitungLuasPersegiPanjang01 {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Panjang : ");
        panjang = sc.nextInt();
        System.out.println("Masukan Lebar : ");
        lebar = sc.nextInt();

        luas=panjang*lebar;

        System.out.println("Luas Persegi Adalah " + luas);
    }
}
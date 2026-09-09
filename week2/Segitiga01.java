import java.util.Scanner;

public class Segitiga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alas, tinggi;
        float luas; //pakai float atau double karna hasil bisa jadi ada koma

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = (float) alas * tinggi / 2; //pembagian 2 harus float atau double agar bisa menghasilkan bilangan pecahan
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
//Nama : ACHMAD KAKA ANDRIAN
//NIM : 2641070210
//ABSEN : 01
import java.util.Scanner;//untuk memanggil scanner

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//membuat scanner baru

        String mode;// mode menggnakan string
        int jumlahZombie, koinDasar;//jumlah zombie dan koin dasar menggunakan int
        double bonus, totalKoin;//bonus dan total koin menggunakan double

        System.out.println("Mode level (siang/malam) : ");
        mode = sc.nextLine();//untuk input mode
        System.out.println("Jumlah zombie dikalahkan : ");
        jumlahZombie = sc.nextInt();//untuk input jumlah zombie
        System.out.println("Koin dasar : ");

        System.out.println("Mode level (siang/malam) : " +mode);//memunculkan mode ke outpout
        System.out.println("Jumlah zombie dikalahkan : " +jumlahZombie);//memunculkan jumlag zombie ke output
        
        if (mode.equalsIgnoreCase("siang")) {
            koinDasar = 10 * jumlahZombie;//menghitung koin dasar siang
            if (jumlahZombie >= 26) {
                bonus = 0.25;
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : 25%");
                totalKoin = (koinDasar + (koinDasar * bonus));
                System.out.println("Total koin : " +totalKoin);
            } else if (jumlahZombie > 10 && jumlahZombie <= 25) {
                bonus = 0.1;
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : 10%");
                totalKoin = (koinDasar + (koinDasar * bonus));
                System.out.println("Total koin : " +totalKoin);
            } else if (jumlahZombie <= 10 && jumlahZombie >= 0) {
                System.out.println("Koin dasar : " +koinDasar); //memunculkan koin dasar
                System.out.println("Bonus : 0%");//memunculkan bonus
                System.out.println("Total koin : " +koinDasar);//memunculkan total koin
            } else {
                System.out.println("Input jumlah zombie tidak valid periksa kembali");//memunculkan mode tidak valid karna tidak sesuai
            }
        } else if (mode.equalsIgnoreCase("malam")) {
            koinDasar = 15 * jumlahZombie;//menghitung koindasar malam
            if (jumlahZombie > 40) {
                totalKoin = koinDasar + 100;//menghitung total koin
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : Hadiah trofi malam + 100 koin");
                System.out.println("Total koin : " +totalKoin);
            } else if (jumlahZombie >= 26) {
                bonus = 0.3;
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : 30%");
                totalKoin = (koinDasar + (koinDasar * bonus));
                System.out.println("Total koin : " +totalKoin);
            } else if (jumlahZombie > 10 && jumlahZombie <= 25) {
                bonus = 0.15;
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : 15%");
                totalKoin = (koinDasar + (koinDasar * bonus));
                System.out.println("Total koin : " +totalKoin);
            } else if (jumlahZombie <= 10 && jumlahZombie >= 0){
                System.out.println("Koin dasar : " +koinDasar);
                System.out.println("Bonus : 0%");
                System.out.println("Total koin : " +koinDasar);
            } else {
                System.out.println("Input jumlah zombie tidak valid periksa kembali");//memunculkan mode tidak valid karna tidak sesuai
            }
        } else {
            System.out.println("Mode tidak valid");//memunculkan mode tidak valid karna tidak sesuai
        }
    }
}
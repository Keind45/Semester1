import java.util.Scanner;

public class KonsultanPajak {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double penghasilan;
        double besaranPajak;

        System.out.println("Masukan penghasilan: ");
        penghasilan = sc.nextDouble();

        if (penghasilan == 0) {
            besaranPajak = 0;
        } else if (penghasilan <= 60000000) {
            besaranPajak = penghasilan * 0.05;
        } else if (penghasilan > 60000000 && penghasilan <= 250000000) {
            besaranPajak = (60000000 * 0.05) 
                         + (penghasilan - 60000000) * 0.15;
        } else if (penghasilan > 250000000 && penghasilan <= 500000000) {
            besaranPajak = (60000000 * 0.05) 
                         + (190000000 * 0.15) 
                         + (penghasilan - 250000000) * 0.25;
        } else {
            besaranPajak = (60000000 * 0.05) 
                         + (190000000 * 0.15) 
                         + (250000000 * 0.25) 
                         + (penghasilan - 500000000) * 0.30;
        }

        System.out.printf("Besaran pajak anda adalah: Rp.%,.0f%n", besaranPajak);
    }
}
import  java.util.Scanner;

public class UgdRsHarapan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sp02;
        int sisaBedICU, tekananDarah, suhu, lajuNapas;
        boolean komorbid, tidakSadar, usia;
        String lokasi;

        System.out.println("Berapa persen saturasi oksigen pasien (1-100%): ");
        sp02 = sc.nextDouble();
        
        System.out.println("Berapa sisa Kamar di ICU: ");
        sisaBedICU = sc.nextInt();
        
        System.out.println("Berapa tekanan darahnya pasien: ");
        tekananDarah = sc.nextInt();
        
        System.out.println("Berapa suhu pasien: ");
        suhu = sc.nextInt();
        
        System.out.println("Berapa kali laju napas pasien per menit: ");
        lajuNapas = sc.nextInt();
        
        System.out.println("Apakah usia pasien di atas 65 (true/false): ");
        usia = sc.nextBoolean();
        
        System.out.println("Apakah pasien mempunyai riwayat komorbid (true/false): ");
        komorbid = sc.nextBoolean();
        
        System.out.println("Apakah pasien dalam keadaan tidak sadar (true/false): ");
        tidakSadar = sc.nextBoolean();
        
        if (sp02 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";
        } else if (sp02 < 85 && sisaBedICU == 0) {
            lokasi = "UGD Ventilator Mobil";
        } else if ((sp02 >=85 && sp02 <= 89) || tekananDarah <= 90 || tekananDarah >= 180 || tidakSadar) {
            lokasi = "Resusitasi UGD";
        } else if ((sp02 >= 90 && sp02 <= 94) || suhu > 39 && komorbid && usia) {
            lokasi = "HCU Isolasi";
        } else if ((sp02 >= 90 && sp02 <= 94) || lajuNapas > 24) {
            lokasi = "Rawat Inap Umum";
        } else {
            lokasi = "Rawat Jalan";
        }

        System.out.println("Lokasi perawatan: " + lokasi);

    }
}
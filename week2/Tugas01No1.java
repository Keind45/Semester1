public class Tugas01No1 {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int jumlahAnak = 4;
        int tunjanganPerAnak = 100000;
        double potonganPensiun = 0.10;

        int tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potongan = gajiPokok * potonganPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potongan;

        System.out.println("Gaji Pokok       : Rp" + gajiPokok);
        System.out.println("Tunjangan Anak   : Rp" + tunjanganAnak);
        System.out.println("Potongan Pensiun : Rp" + potongan);
        System.out.println("Gaji Bersih      : Rp" + gajiBersih);
    }
}
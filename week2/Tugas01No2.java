import java.util.Scanner;

public class Tugas01No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: Rp");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan anak per bulan: Rp");
        double tunjanganAnak = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        double totalTunjangan = tunjanganAnak * jumlahAnak;
        double potonganPensiun = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("\nTotal Tunjangan : Rp" + totalTunjangan);
        System.out.println("Potongan Pensiun: Rp" + potonganPensiun);
        System.out.println("Gaji Bersih     : Rp" + gajiBersih);

        input.close();
    }
}
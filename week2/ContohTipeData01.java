public class ContohTipeData01 {
    public static void main(String[] args) {
        char golonganDarah = 'o';
        byte Jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50f;
        double berat = 0.5467812345;
        long saldo = 1500000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan Darah\t\t\t\t\t\t: " + (byte) golonganDarah); //casting ke byte sehingga di paksa menjadi numeric
        System.out.println("Jarak\t\t\t\t\t\t\t: " + Jarak);
        System.out.println("Jumlah Penduduk Dalam Satu Dusun\t\t\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t\t: " + suhu); //karna ada F maka di konversi menjadi float makanya hasilnya 60.5
        System.out.println("Berat\t\t\t\t\t\t\t: " + (float) berat); //casting ke float sehingga di paksa menjadi float 
        System.out.println("Saldo\t\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka Desimal\t\t\t\t\t\t: " + angkaDesimal); //karna ada 0x maka di konversi menjadi hexadesimal makanya hasilnya 16
    }
}
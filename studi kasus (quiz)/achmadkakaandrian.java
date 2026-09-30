//Nama : ACHMAD KAKA ANDRIAN
//NIM : 264107020210

import java.util.Scanner; //untuk memanggil Scanner

public class achmadkakaandrian {

    public static void main(String[] args) {
        int tarifDasar, biayaMakan, jarakPerjalanan, biayaBahanBakar, jumlahTransaksi, hargaJualMakanan; //untuk mendeklarasikan tarif dasar, biaya makan, dll menggunakan tipe data int agar bisa di operasikan dengan aritmatika
        double keuntunganDriver, keuntunganMerchant, komisiPerusahaan, resikoKeterlambatan, resikoKerusakanBarang, keuntunganTotal, ratarataKeuntungan, persentaseDriver, persentaseMerchant; //untuk mendeklarasikan keuntunganDriver, keuntunganMerchant, dll menggunakan tipe data double karna mungkin hasilnya desimal

        Scanner input = new Scanner(System.in); //membuat input scanner agar bisa menginputkan data dari user secara manual saat menjalankan program  

        System.out.print("Masukkan tarif dasar (dalam Rp): "); //agar user tau harus mengimputkan apa (tarif dasar)
        tarifDasar = input.nextInt(); //agar input dari tarif dasar bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan jarak perjalanan (dalam km): "); //agar user tau harus mengimputkan apa (jarak perjalanan)
        jarakPerjalanan = input.nextInt(); //agar input dari jarak perjalanan bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan biaya bahan bakar (dalam Rp): "); //agar user tau harus mengimputkan apa (biaya bahan bakar)
        biayaBahanBakar = input.nextInt(); //agar input dari biaya bahan bakar bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan komisi perusahaan (1-100%): "); //agar user tau harus mengimputkan apa (komisi perusahaan)
        komisiPerusahaan = input.nextDouble(); //agar input dari komisi perusahaan bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan resiko keterlambatan (1-100%): "); //agar user tau harus mengimputkan apa (resiko keterlambatan)
        resikoKeterlambatan = input.nextDouble(); //agar input dari resiko keterlambatan bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan jumlah transaksi (dalam bil bulat): "); //agar user tau harus mengimputkan apa (jumlah transaksi)
        jumlahTransaksi = input.nextInt(); //agar input dari jumlah transaksi bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan harga jual makanan (dalam Rp): "); //agar user tau harus mengimputkan apa (harga jual makanan)
        hargaJualMakanan = input.nextInt(); //agar input dari harga jual makanan bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan biaya makan (dalam Rp): "); //agar user tau harus mengimputkan apa (biaya makan)
        biayaMakan = input.nextInt(); //agar input dari biaya makan bisa di input manual sendiri saat menjalankan program
        System.out.print("Masukkan resiko kerusakan barang (1-100%): "); //agar user tau harus mengimputkan apa (resiko kerusakan barang)
        resikoKerusakanBarang = input.nextDouble(); //agar input dari resiko kerusakan barang bisa di input manual sendiri saat menjalankan program

        keuntunganDriver = ((tarifDasar * jarakPerjalanan - biayaBahanBakar * jarakPerjalanan) * (1 - komisiPerusahaan / 100.0) * (resikoKeterlambatan / 100.00) * jumlahTransaksi); //untuk menghitung keuntungan driver
        keuntunganMerchant = (hargaJualMakanan - biayaMakan) * (1 - resikoKerusakanBarang / 100.0) * (1 - komisiPerusahaan/100.0) * jumlahTransaksi; //untuk menghitung keuntungan merchant
        keuntunganTotal = (keuntunganDriver + keuntunganMerchant); //untuk menghitung keuntungan total
        ratarataKeuntungan = keuntunganTotal/2; //untuk menghitung rata rata keuntungan
        persentaseDriver = keuntunganDriver/keuntunganTotal; //untuk menghitung presentase keuntungan driver
        persentaseMerchant = keuntunganMerchant/keuntunganTotal; //untuk menghitung presentase keuntungan merchant

        System.out.println("tarif dasar\t\t\t\t\t\t: Rp." + tarifDasar); //untuk menampilkan tarif dasar
        System.out.println("jarak perjalanan\t\t\t\t\t: " + jarakPerjalanan +"km"); //untuk menampilkan jarak perjalanan
        System.out.println("biaya bahan bakar\t\t\t\t\t: Rp." + biayaBahanBakar); //untuk menampilkan biaya bahan bakar
        System.out.println("komisi perusahaan\t\t\t\t\t: " + komisiPerusahaan +"%"); //untuk menampilkan komisi perusahaan
        System.out.println("resiko keterlambatan\t\t\t\t\t: " + resikoKeterlambatan +"%"); //untuk menampilkan resiko keterlambatan
        System.out.println("jumlah transaksi\t\t\t\t\t: " + jumlahTransaksi); //untuk menampilkan jumlah transaksi
        System.out.println("harga jual makanan\t\t\t\t\t: Rp." + hargaJualMakanan); //untuk menampilkan harga jual makanan
        System.out.println("biaya makan\t\t\t\t\t\t: Rp." + biayaMakan); //untuk menampilkan biaya makan
        System.out.println("resiko kerusakan barang\t\t\t\t\t: " + resikoKerusakanBarang +"%"); //untuk menampilkan kerusakan barang
        System.out.println("Keuntungan Driver\t\t\t\t\t: Rp." + keuntunganDriver); //untuk menampilkan keuntungan driver
        System.out.println("Keuntungan Merchant\t\t\t\t\t: Rp." + keuntunganMerchant); //untuk menampilkan keuntungan merchant
        System.err.println("Keuntungan Total\t\t\t\t\t: RP." + keuntunganTotal); //untuk menampilkan keuntungan total
        System.err.println("Rata Rata Keuntungan\t\t\t\t\t: Rp." + ratarataKeuntungan); //untuk menampilkan rata rata keuntungan
        System.out.println("Persentase Keuntungan Driver\t\t\t\t: " + persentaseDriver  +"%"); //untuk menampilkan persentase keuntungan driver
        System.out.println("Persentase Keuntungan Merchant\t\t\t\t: " + persentaseMerchant  +"%"); //untuk menampilkan persentase keuntungan merchant
    }
}

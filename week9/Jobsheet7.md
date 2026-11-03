# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** ACHMAD KAKA ANDRIAN
* **NIM:** 264107020210
* **Kelas / No. Presensi:** TI-1D / 01
* **Username GitHub:** Keind45
* **Link Repository:** https://github.com/Keind45/Semester1/tree/main/week9

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while, dan do-while).
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan bahasa pemrograman Java.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan FOR

Pada percobaan ini, mahasiswa membuat program untuk mencari nilai tertinggi dan terendah Kuis dari 10 mahasiswa menggunakan perulangan *FOR* sesuai flowchart pada jobsheet.

#### 2.1.1 Kode Program Java (`SiakadFor01.java`)
```java
import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
![Output Percobaan 1](/p1.png)

#### 2.1.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
* **Jawab:** Pada `for (int i = 1; i <= 10; i++)` terdapat tiga komponen:
  1. **Inisialisasi:** `int i = 1`, yaitu nilai awal variabel perulangan.
  2. **Kondisi:** `i <= 10`, yaitu perulangan berjalan selama kondisi bernilai true.
  3. **Update (iterasi):** `i++`, yaitu menambah nilai `i` sebanyak 1 setiap akhir iterasi.

  Selain itu terdapat **badan perulangan** (isi di dalam `{ }`) yang berisi input nilai dan dua pengecekan `if`.

* **Pertanyaan 2:** Mengapa variabel `tertinggi` diinisialisasi 0 dan `terendah` diinisialisasi 100? Apa yang terjadi jika `tertinggi` diinisialisasi 100 dan `terendah` diinisialisasi 0?
* **Jawab:** Nilai berada pada rentang 0 sampai 100. `tertinggi` diawali 0 (nilai paling kecil) agar nilai pertama yang dimasukkan pasti lebih besar atau sama dengan nilai awal dan bisa menggantikannya. `terendah` diawali 100 (nilai paling besar) agar nilai pertama pasti lebih kecil atau sama dengan nilai awal. Jika dibalik (`tertinggi = 100` dan `terendah = 0`), kondisi `nilai > tertinggi` dan `nilai < terendah` tidak pernah terpenuhi, sehingga hasil akhir selalu salah: tertinggi tetap 100 dan terendah tetap 0, apa pun nilai yang dimasukkan.

* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```java
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```
* **Jawab:** Potongan kode ini berfungsi mencari nilai tertinggi dan terendah. Pada setiap iterasi, program membandingkan `nilai` yang baru dimasukkan dengan `tertinggi`; jika lebih besar, `tertinggi` diganti dengan `nilai`. Lalu `nilai` dibandingkan dengan `terendah`; jika lebih kecil, `terendah` diganti dengan `nilai`. Kedua `if` ditulis terpisah (bukan `else if`) karena keduanya perlu dicek pada setiap nilai. Setelah 10 iterasi, `tertinggi` dan `terendah` berisi nilai terbesar dan terkecil.

* **Pertanyaan 4:** Modifikasi kode program untuk menghitung jumlah mahasiswa yang lulus dan tidak lulus (nilai minimal 60), lalu tampilkan setelah nilai tertinggi dan terendah!
* **Jawab:** Ditambahkan variabel `lulus` dan `tidakLulus`, lalu pengecekan di dalam perulangan.

```java
import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
```

Hasil dengan data yang sama seperti verifikasi: tertinggi 90.1, terendah 55.3, lulus 9, tidak lulus 1.

![Output Modifikasi Percobaan 1](/p1.png)

* **Pertanyaan 5:** Commit dan push kode program ke Github.
* **Jawab:** Sudah dilakukan.

![Commit Percobaan 1](/csj.png)

---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan WHILE

Pada percobaan ini, mahasiswa membuat program untuk menentukan kategori nilai huruf (A, B+, B, C+, C, D, E) menggunakan perulangan *WHILE*. Nilai yang tidak valid (negatif atau lebih dari 100) diabaikan dan input diulang.

#### 2.2.1 Kode Program Java (`SiakadWhile01.java`)
```java
import java.util.Scanner;

public class SiakadWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
    }
}
```

#### 2.2.2 Hasil Running / Screenshot Output
![Output Percobaan 2](/p2.png)

#### 2.2.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Pada potongan kode `if (nilai < 0 || nilai > 100) { ... continue; }`, tentukan maksud dan kegunaan dari sintaks berikut:
  * **a. `nilai < 0 || nilai > 100`**
  * **Jawab:** Kondisi ini memakai operator OR (`||`) untuk memeriksa apakah nilai berada di luar rentang valid 0 sampai 100. Kondisi bernilai true jika nilai negatif **atau** lebih dari 100, sehingga nilai tersebut dianggap tidak valid.
  * **b. `continue`**
  * **Jawab:** `continue` melewati sisa perintah di dalam badan perulangan pada iterasi saat itu dan langsung kembali ke pengecekan kondisi `while`. Karena `i++` ikut terlewati, nilai `i` tidak bertambah sehingga program meminta input ulang untuk mahasiswa yang sama.

* **Pertanyaan 2:** Mengapa sintaks `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
* **Jawab:** `i++` ditulis di akhir agar `i` hanya bertambah setelah nilai valid selesai diproses. Jika ditulis di awal, `i` bertambah sebelum input dan pengecekan. Akibatnya nomor mahasiswa yang ditampilkan (`i + 1`) bergeser, yaitu mulai dari ke-2, dan ketika input tidak valid (`continue`) `i` sudah terlanjur bertambah sehingga mahasiswa tersebut terlewati dan tidak diinput ulang.

* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
* **Jawab:** 19 kali, karena `i` dimulai dari 0 dan perulangan berjalan selama `i < 19`, yaitu untuk `i` = 0 sampai 18 (jika semua input valid). Input tidak valid tidak menambah `i`, sehingga yang dihitung tetap 19 nilai valid, meskipun badan perulangan bisa dijalankan lebih sering karena pengulangan input.

* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
* **Jawab:** Pada cabang nilai A ditambahkan satu baris `println`.

```java
if (nilai > 80 && nilai <= 100) {
    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
    System.out.println("Bagus, pertahankan nilainya");
} else if (nilai > 73 && nilai <= 80) {
    // ... cabang lain tidak berubah
```

![Output Modifikasi Percobaan 2](/p2_5.png)

* **Pertanyaan 5:** Commit dan push kode program ke Github.
* **Jawab:** Sudah dilakukan.

![Commit Percobaan 2](/csj.png)

---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe - Perulangan DO-WHILE

Pada percobaan ini, mahasiswa membuat program kasir kafe yang memproses transaksi pelanggan secara terus-menerus menggunakan perulangan *DO-WHILE* hingga kasir memasukkan "batal". Harga: kopi Rp 12.000, teh Rp 7.000, roti Rp 20.000.

#### 2.3.1 Kode Program Java (`KafeDoWhile01.java`)
```java
import java.util.Scanner;

public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); // membersihkan newline dari buffer
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
```

#### 2.3.2 Hasil Running / Screenshot Output
![Output Percobaan 3](/p3.png)

#### 2.3.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?
* **Jawab:** 1 kali. DO-WHILE selalu menjalankan badan perulangan minimal satu kali sebelum kondisi diperiksa. Pada iterasi pertama tersebut, program membaca nama "batal", menampilkan "Transaksi dibatalkan.", lalu `break` menghentikan perulangan tanpa memproses pembelian apa pun.

* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
* **Jawab:** Perulangan berhenti ketika `namaPelanggan.equalsIgnoreCase("batal")` bernilai true (huruf besar/kecil tidak berpengaruh), lalu perintah `break` dijalankan. Kondisi `while (true)` sendiri tidak pernah bernilai false.

* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE?
* **Jawab:** Nilai `true` membuat kondisi selalu terpenuhi sehingga perulangan terus berjalan tanpa batas (*infinite loop*), dan hanya berhenti jika ada `break` dari dalam perulangan. Dengan begitu jumlah transaksi tidak perlu ditentukan di awal.

* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
* **Jawab:** Karena perulangan tidak bergantung pada variabel penghitung. Kondisinya adalah `true` yang selalu terpenuhi, dan penghentiannya dikendalikan oleh input pengguna melalui `break`. Inisialisasi dan update hanya diperlukan jika perulangan dikontrol oleh sebuah counter seperti `i`.

![Commit Percobaan 3](/csj.png)

---

## 3: TUGAS MANDIRI

### 3.1 Tugas 1: Total Penjualan Tiket Bioskop

Program menghitung total tiket yang terjual dan total penjualan dalam satu hari. Harga tiket Rp 50.000. Pembelian lebih dari 4 tiket mendapat diskon 10%, lebih dari 10 tiket mendapat diskon 15%. Input negatif diabaikan dan diminta ulang. Input `0` digunakan untuk mengakhiri program.

#### 3.1.1 Kode Program Java (`TugasBioskop01.java`)
```java
import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlah, persenDiskon, totalBayar;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            if (jumlah > 10) {
                persenDiskon = 15;
            } else if (jumlah > 4) {
                persenDiskon = 10;
            } else {
                persenDiskon = 0;
            }

            totalBayar = jumlah * hargaTiket;
            totalBayar = totalBayar - (totalBayar * persenDiskon / 100);

            System.out.println("Diskon: " + persenDiskon + "%, total bayar: Rp " + totalBayar);

            totalTiket += jumlah;
            totalPenjualan += totalBayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}
```

#### 3.1.2 Hasil Running / Screenshot Output
![Output Tugas 1](/t1.png)

---

### 3.2 Tugas 2: Total Pembayaran Parkir (Implementasi Flowchart)

Program menghitung total pembayaran parkir beberapa kendaraan sesuai flowchart: tarif mobil Rp 3.000/jam, motor Rp 2.000/jam, dan program terus meminta input selama jenis kendaraan bukan 0.

#### 3.2.1 Kode Program Java (`TugasParkir01.java`)
```java
import java.util.Scanner;

public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
```

#### 3.2.2 Hasil Running / Screenshot Output
![Output Tugas 2](/t2.png)

Perhitungan: mobil 2 jam x 3000 = 6000, motor 3 jam x 2000 = 6000, total = 12000.

![Commit Tugas](/csj.png)

---

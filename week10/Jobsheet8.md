# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** ACHMAD KAKA ANDRIAN
* **NIM:** 264107020210
* **Kelas / No. Presensi:** TI-1D / 01
* **Username GitHub:** Keind45
* **Link Repository:** https://github.com/Keind45/Semester1/tree/main/week10

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang pada algoritma.
2. Memahami alur perulangan bersarang.
3. Mengenal sintaks perulangan bersarang.
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Review Perulangan 1

Pada percobaan ini, mahasiswa mengulang konsep perulangan *FOR* dengan mencetak karakter `*` sebanyak *n* kali secara mendatar.

#### 2.1.1 Kode Program Java (`Star01.java`)
```java
import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
![Output Percobaan 1](./gambar/p1_output.png)

| Uji | Input n | Output | Jumlah `*` |
| --- | --- | --- | --- |
| 1 | 5 | `*****` | 5 |
| 2 | 3 | `***` | 3 |
| 3 | 7 | `*******` | 7 |

#### 2.1.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika n = 5? Jelaskan.
* **Jawab:** Tercetak 6 karakter `*`. Dengan `i = 0` dan kondisi `i <= 5`, perulangan berjalan untuk i = 0, 1, 2, 3, 4, 5, yaitu 6 kali, sehingga ada satu iterasi tambahan.

* **Pertanyaan 2:** Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat n = 5? Mengapa hasilnya berbeda?
* **Jawab:** 4 kali (i = 1, 2, 3, 4). Operator `<` tidak menyertakan nilai batas, sehingga saat i = 5 kondisi `5 < 5` bernilai false dan perulangan berhenti. Pada `<=`, nilai batas ikut dijalankan sehingga hasilnya 5 kali.

* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan menjalankannya. Modifikasi agar mencetak bilangan ganjil positif yang tidak melebihi n.
```java
for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
}
```
* **Jawab:** Prediksi output: `2 4 6 8 `. Nilai i dimulai dari 2 dan naik 2 setiap iterasi (2, 4, 6, 8); saat i = 10 kondisi `10 <= 9` false sehingga berhenti. Agar mencetak bilangan ganjil, inisialisasi diubah menjadi 1:
```java
for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```
Untuk n = 9, outputnya `1 3 5 7 9 `.

![Output Pertanyaan 3](./gambar/p1_q3.png)

* **Pertanyaan 4:** Jelaskan mengapa perubahan *increment* `i++` menjadi `i--` (dengan kondisi tetap `i <= n`) membuat perulangan berjalan terus-menerus.
* **Jawab:** `i` dimulai dari 1 lalu terus berkurang (0, -1, -2, ...), sehingga nilainya selalu lebih kecil dari n dan kondisi `i <= n` tetap true. Nilai `i` bergerak menjauhi batas, bukan mendekatinya, sehingga kondisi tidak pernah menjadi false. (Secara teknis nilai `int` akhirnya melewati batas terkecilnya lalu berputar ke nilai terbesar, tetapi itu butuh miliaran iterasi sehingga tidak berhenti dalam waktu wajar.)

![Commit Percobaan 1](./gambar/p1_commit.png)

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Pada percobaan ini, mahasiswa menggunakan *nested FOR* untuk mencetak persegi panjang bintang. *Outer loop* mengatur baris, *inner loop* mengatur kolom.

#### 2.2.1 Kode Program Java (`Rectangle01.java`)
```java
![alt text](image.png)
```

#### 2.2.2 Hasil Running / Screenshot Output
![Output Percobaan 2](./gambar/p2_output.png)

```text
Masukkan jumlah baris: 3
Masukkan jumlah kolom: 6
******
******
******
```

| Uji | Baris | Kolom | Bentuk Output |
| --- | --- | --- | --- |
| 1 | 3 | 6 | 3 baris, tiap baris 6 bintang (`******`) |
| 2 | 4 | 2 | 4 baris, tiap baris 2 bintang (`**`) |
| 3 | 1 | 5 | 1 baris dengan 5 bintang (`*****`) |

Ketiganya berbentuk persegi panjang (atau satu garis lurus pada kasus 1 baris); jumlah baris mengikuti input baris dan lebar mengikuti input kolom.

#### 2.2.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j` pada program tersebut.
* **Jawab:** `i` adalah variabel penghitung *outer loop* yang menunjukkan nomor baris saat ini. `j` adalah variabel penghitung *inner loop* yang menunjukkan nomor kolom (bintang ke-berapa) di dalam baris tersebut.

* **Pertanyaan 2:** Berapa kali *outer loop*, *inner loop*, dan perintah `print("*")` dijalankan untuk baris = 4 dan kolom = 7?
* **Jawab:** *Outer loop* dijalankan 4 kali. *Inner loop* dijalankan 4 kali secara total (satu kali per baris), dengan masing-masing 7 iterasi. Perintah `print("*")` dijalankan 4 x 7 = 28 kali.

* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan `kolom`, inner menggunakan `baris`)? Gunakan baris = 3 dan kolom = 6.
* **Jawab:** *Outer loop* berjalan 6 kali (jumlah baris yang tercetak) dan setiap barisnya berisi 3 bintang (inner loop 3 kali). Hasilnya 6 baris dengan 3 bintang per baris, sehingga bentuknya terbalik dari yang diharapkan (3 baris x 6 kolom):
```text
***
***
***
***
***
***
```

* **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah *inner loop*.
* **Jawab:** Program tidak pernah pindah baris, sehingga seluruh bintang tercetak menyambung dalam satu baris. Untuk baris = 3 dan kolom = 6, hasilnya satu baris berisi 18 bintang (`******************`).

* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah `#`, lalu commit dan push.
* **Jawab:** Pada inner loop, `System.out.print("*");` diganti menjadi `System.out.print("#");`.
```java
for (int i = 1; i <= baris; i++) {
    for (int j = 1; j <= kolom; j++) {
        System.out.print("#");
    }
    System.out.println();
}
```
Output untuk baris = 3 dan kolom = 6:
```text
######
######
######
```

![Output Modifikasi Percobaan 2](./gambar/p2_modifikasi.png)
![Commit Percobaan 2](./gambar/p2_commit.png)

---

### 2.3 Percobaan 3: Debugging Bintang Segitiga - Nested WHILE

Pada percobaan ini, mahasiswa mencari kesalahan pada kode *nested WHILE* yang belum menghasilkan segitiga yang benar, lalu memperbaikinya tanpa mengganti WHILE menjadi FOR.

#### 2.3.1 Kode Awal (Sebelum Diperbaiki)
```java
int i = 0;
while (i <= n) {
    int j = 0;
    while (j < i) {
        System.out.print("*");
        j++;
    }
    i++;
}
```

Output aktual kode awal:

| Input n | Output Aktual |
| --- | --- |
| 3 | `******` (satu baris, 6 bintang) |
| 5 | `***************` (satu baris, 15 bintang) |

Output target n = 5 adalah segitiga bertingkat 5 baris (`*`, `**`, `***`, `****`, `*****`).

![Output Kode Awal](./gambar/p3_awal.png)

#### 2.3.2 Hasil Debug (n = 5)
Dengan tambahan `System.out.print("[i=" + i + "] ");` setelah `while (i <= n) {`:
```text
[i=0] [i=1] *[i=2] **[i=3] ***[i=4] ****[i=5] *****
```

* **5a.** *Outer loop* dijalankan 6 kali (i = 0 sampai 5), tidak sama dengan jumlah baris yang diinginkan yaitu 5.
* **5b.** Saat `i = 0`, tidak ada karakter `*` yang tercetak (0 bintang), karena kondisi `j < 0` langsung false.
* **5c.** Semua karakter tampil dalam satu baris karena tidak ada `System.out.println()` yang memindahkan kursor ke baris baru.

![Output Debug](./gambar/p3_debug.png)

#### 2.3.3 Proses Perbaikan
* **Perbaikan 6a:** Menambahkan `System.out.println();` setelah *inner loop*, sebelum `i++`. Hasilnya bintang sudah turun per baris, tetapi masih ada satu baris kosong di awal (iterasi i = 0), sehingga total ada 6 baris.
* **Perbaikan 6b:** Mengubah inisialisasi *outer loop* menjadi `int i = 1;` (kondisi `i <= n` dipertahankan) sehingga perulangan berjalan tepat n kali tanpa baris kosong.

#### 2.3.4 Kode Program Java Akhir (`Triangle01.java`)
Baris debug sudah dihapus, dan ditambahkan segitiga terbalik menggunakan *nested WHILE* kedua.
```java
import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga bertingkat
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Segitiga terbalik
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
```

#### 2.3.5 Hasil Running / Screenshot Output
![Output Percobaan 3](./gambar/p3_output.png)

```text
Masukkan nilai n = 5
*
**
***
****
*****
*****
****
***
**
*
```

#### 2.3.6 Jawaban Pertanyaan

* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
* **Jawab:** Ketidaksesuaian: (1) semua bintang tercetak dalam satu baris karena tidak ada perintah pindah baris, dan (2) *outer loop* berjalan n + 1 kali sehingga ada iterasi pertama (i = 0) yang tidak mencetak bintang. Perbaikan: (1) menambahkan `System.out.println();` setelah *inner loop* sebelum `i++`, dan (2) mengubah inisialisasi `i` dari 0 menjadi 1 agar perulangan berjalan tepat n kali.

* **Pertanyaan 2:** Jelaskan peran variabel `i` dan `j`. Mengapa nilai `j` harus diinisialisasi kembali ke 0 pada setiap iterasi *outer loop*? Apa yang terjadi jika `j` tidak di-reset?
* **Jawab:** `i` berperan sebagai nomor baris (penentu banyaknya bintang pada baris itu), sedangkan `j` sebagai penghitung bintang yang sudah dicetak pada baris yang sedang diproses. `j` harus kembali ke 0 setiap baris baru karena setiap baris mulai menghitung bintang dari awal. Jika tidak di-reset, `j` masih bernilai sisa baris sebelumnya sehingga kondisi `j < i` hanya terpenuhi sekali: setiap baris hanya mencetak 1 bintang, dan polanya tidak lagi berbentuk segitiga.

* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (*update*) pada *outer loop* yang diperlukan untuk membentuk segitiga terbalik.
* **Jawab:** Inisialisasi diubah menjadi `i = n` (mulai dari baris terpanjang), kondisi menjadi `i >= 1` (berhenti setelah baris terpendek), dan *update* menjadi `i--` (panjang baris berkurang satu setiap iterasi).

![Commit Percobaan 3](./gambar/p3_commit.png)

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Pada percobaan ini, mahasiswa membuat program yang menghitung rata-rata nilai tiap kelompok dan menentukan kelompok dengan rata-rata tertinggi menggunakan tiga tingkat perulangan: WHILE (kelompok), FOR (penilai), dan DO-WHILE (validasi nilai).

#### 2.4.1 Kode Program Java (`NilaiKelompok01.java`)
```java
import java.util.Scanner;

public class NilaiKelompok01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok
                        + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}
```

#### 2.4.2 Hasil Running / Screenshot Output
![Output Percobaan 4](/p4.png)


#### 2.4.3 Jawaban Pertanyaan

* **Pertanyaan 1:** Mengapa `totalNilai` perlu di-reset di dalam *outer loop*, tetapi `rataTertinggi` tidak boleh di-reset pada setiap kelompok?
* **Jawab:** `totalNilai` menampung jumlah nilai satu kelompok saja, sehingga harus kembali ke 0 di awal setiap kelompok agar tidak tercampur dengan nilai kelompok sebelumnya. `rataTertinggi` menyimpan rekor dari seluruh kelompok yang sudah diproses; jika di-reset, rekor sebelumnya hilang dan perbandingan hanya terjadi dengan nilai awal, sehingga hasil akhir tidak lagi mewakili kelompok terbaik secara keseluruhan.

* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?
* **Jawab:** 3 x 2 = 6 kali (2 iterasi untuk setiap kelompok, dan ada 3 kelompok).

* **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` dideklarasikan sebagai `int` dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
* **Jawab:** Hasil pembagian dibulatkan ke bawah (bagian desimal hilang), sehingga rata-rata menjadi tidak akurat. Contoh: nilai 80 dan 91 menghasilkan total 171, dan `171 / 2` bernilai 85 (bukan 85.5), sehingga yang tampil 85.0.

* **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.
* **Jawab:** Karena nilai valid minimal 0, rata-rata sekecil apa pun harus bisa lebih besar dari nilai awal agar kelompok pertama pasti tercatat. Jika nilai awal 0 dan semua penilai memberi nilai 0 (misalnya 2 kelompok dengan seluruh nilai 0), kondisi `0 > 0` tidak pernah true, sehingga `kelompokTerbaik` tetap 0 dan program menampilkan "Kelompok terbaik : 0" yang salah (tidak ada kelompok bernomor 0).

* **Pertanyaan 5:** Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.
* **Jawab:**
  1. **WHILE (luar):** memproses kelompok satu per satu sampai `nomorKelompok` melebihi `jumlahKelompok`.
  2. **FOR (tengah):** memproses penilai dari 1 sampai `jumlahPenilai` (jumlah pengulangan sudah diketahui) dan menjumlahkan nilainya.
  3. **DO-WHILE (dalam):** meminta input nilai minimal sekali dan mengulanginya selama nilai berada di luar rentang 0-100 (validasi input).

![Commit Percobaan 4](/sp4.png)

---

## 3: TUGAS MANDIRI

### 3.1 Tugas 1: Pola Bilangan Bertingkat

Program mencetak pola bilangan 1 sampai nomor baris, lalu menampilkan total angka yang tercetak.

#### 3.1.1 Kode Program Java (`Tugas101.java`)
```java
import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
```

#### 3.1.2 Hasil Running / Screenshot Output
![Output Tugas 1](/t1.png)

---

### 3.2 Tugas 2: Tabel Perkalian

Program menampilkan tabel perkalian n x n menggunakan nested FOR, lalu menampilkan jumlah seluruh angka pada tabel.

#### 3.2.1 Kode Program Java (`Tugas201.java`)
```java
import java.util.Scanner;

public class Tugas201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
```

#### 3.2.2 Hasil Running / Scree![alt text](image.png)nshot Output
![Output Tugas 2](/t2.png)

---

### 3.3 Tugas 3: Rekap Penjualan Beberapa Toko

Program meminta jumlah toko, jumlah pelanggan tiap toko, dan jumlah barang tiap pelanggan, lalu menampilkan total pelanggan dan total barang per toko, total barang seluruh toko, serta toko dengan barang terbanyak (nomor terkecil jika seri).

#### 3.3.1 Kode Program Java (`Tugas301.java`)
```java
import java.util.Scanner;

public class Tugas301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSeluruh = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("Toko " + t);

            int pelanggan;
            do {
                System.out.print("  Jumlah pelanggan: ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("  Tidak boleh negatif. Ulangi input!");
                }
            } while (pelanggan < 0);

            int totalBarangToko = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("    Jumlah barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("    Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            System.out.println("Toko " + t + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarangToko);
            totalSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
```

#### 3.3.2 Hasil Running / Screenshot Output
![Output Tugas 3](/t3.png)

![Commit Tugas](./gambar/t_commit.png)

---

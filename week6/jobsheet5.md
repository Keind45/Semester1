# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Achmad Kaka Andrian
* **NIM:** 264107020210
* **Kelas / No. Presensi:** Ti-1D / 01

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan bersarang[cite: 1].
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Java[cite: 1].
3. Mahasiswa mampu menerapkan operator logika `&&`, `||`, dan `!` pada struktur pemilihan[cite: 1].

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

Pada percobaan ini, mahasiswa menerapkan struktur *Nested IF* untuk memeriksa syarat pendaftaran ujian skripsi pada sistem SIMTA[cite: 1]. Sistem mengecek status kompen mahasiswa terlebih dahulu, kemudian memeriksa jumlah log bimbingan dengan Pembimbing 1 dan Pembimbing 2[cite: 1].

#### 2.1.1 Kode Program Java
```java
import java.util.Scanner;

public class nestedUjianSkripsi01 {
    public static void main(String[] args) {
        String pesan;

        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
            System.out.println(pesan);
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/contoh-gambar.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa fungsi dari perintah `if`?
  * **Jawab:** Perintah `if` digunakan untuk mengeksekusi sebuah blok kode hanya jika kondisi bernilai `true`.
* **Pertanyaan 2:** Apa yang terjadi jika kondisi bernilai `false`?
  * **Jawab:** Program akan melewati blok `if` dan mengeksekusi blok `else` (jika ada).

---

### 2.2 Percobaan 2: Penerapan Structure SWITCH-CASE

Paragraf ini menjelaskan ringkasan Percobaan 2. Percobaan ini berfokus pada penggunaan `switch-case` untuk memilih menu atau opsi berdasarkan nilai yang bersifat spesifik.

#### 2.2.1 Tabel Pengujian Parameter Output

Berikut adalah hasil uji coba program dengan beberapa variasi masukan *dummy*:

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `Case 1` | "Pilihan 1 Dipilih" | Valid |
| 2 | `Case 2` | "Pilihan 2 Dipilih" | Valid |
| 3 | `Default` | "Pilihan Tidak Tersedia" | Invalid |

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas mandiri yang harus dikerjakan:

* [x] **Tugas 1:** Implementasi flowchart sistem diskon toko buku menggunakan struktur pemilihan bersarang (*Nested IF*).


* [x] **Tugas 2:** Program Java sistem seleksi calon asisten praktikum bertahap (`tugas2SeleksiAsistenNoPresensi.java`).



### 3.1 Implementasi Kode Tugas 1 (Sistem Diskon Toko Buku)

```java
import java.util.Scanner;

public class diskonTokoBuku {
    public static void main(String[] args) {
        String hari, jenis;
        double jumlah, diskon, diskontotal;

        Scanner  sc = new Scanner(System.in);

        System.out.println("Sekarang hari apa: (senin, selasa, rabu, kamis, jumat, sabtu, minggu): ");
        hari = sc.nextLine().trim();
        System.out.println("Jenis buku: (kamus, novel, lainya): ");
        jenis = sc.nextLine().trim();
        System.out.println("Jumlah buku yang di beli: ");
        jumlah = sc.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenis.equalsIgnoreCase("kamus")) {
                if (jumlah > 2) {
                    diskon = 0.12;
                } else {
                    diskon = 0.10;
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                if (jumlah > 3) {
                    diskon = 0.09;
                } else if (jumlah <= 3) {
                    diskon = 0.08;
                } else {
                    diskon = 0.07;
                }
            } else {
                    if(jumlah > 3) {
                        diskon = 0.05;
                    } else {
                        diskon = 0;
                    }
            }
        } else {
            diskon = 0;
        }
            diskontotal = 100 * diskon;
            System.out.println("Diskon anda adalah: " + diskontotal + "%");
    }
}

```

### 3.2 Implementasi Kode Tugas 2 (Sistem Seleksi Asisten Praktikum)

```java
import java.util.Scanner;

public class tugas2SeleksiAsisten01 {
    public static void main(String[] args) {
        boolean mahasiswaAktif, dalamSanksi, sertifikat;
        int nilaiDaspro, wawancara;
        String pesan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah mahasiswa berstatus aktif (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sedang dalam sanksi akademik (true/false): ");
        dalamSanksi = sc.nextBoolean();
        System.out.println("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman (true/false): ");
        sertifikat = sc.nextBoolean();
        System.out.println("Berapa nilai daspro beliau: ");
        nilaiDaspro = sc.nextInt();
        System.out.println("Berapa nilai wawancara beliau: ");
        wawancara = sc.nextInt();

        if (mahasiswaAktif) {
            if (!dalamSanksi) {
                if (nilaiDaspro >= 80 || sertifikat) {
                    if (wawancara >= 75) {
                        pesan = "Anda di terima bro";
                    } else {
                        pesan = "Maaf anda ditolak karna nilai wawancara anda kurang dari 75 bro";
                    }
                } else {
                pesan = "Maaf anda ditolak karna nilai daspro anda kurang dari 80 dan anda juga tidak memiliki sertifikat bro";
                }
            } else {
                pesan = "Maaf anda di tolak anda sedang dalam sanksi bro";
            }
        } else {
            pesan = "Maaf anda ditolak karna anda bukan mahasiswa bro";
        }
        System.out.println(pesan);
    }
}

```

---

## 4: KESIMPULAN

Tuliskan paragraf kesimpulan di sini. Secara singkat, struktur pemilihan sangat penting digunakan untuk mengatur alur jalannya program (*flow control*) berdasarkan variabel atau pilihan yang ditentukan oleh pengguna.

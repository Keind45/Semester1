# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** [Nama Mahasiswa]
* **NIM:** [NIM Mahasiswa]
* **Kelas / No. Presensi:** [Kelas] / [No. Presensi]

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

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        String pesan;

        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
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

#### 2.1.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 2:** Jelaskan maksud dari potongan kode `if (bimbinganP1 >= 8 && bimbinganP2 >= 4)`!


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!


* **Jawab:** [Tuliskan jawaban Anda di sini]



---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Percobaan ini bertujuan untuk menerapkan operator logika `&&` (AND), `||` (OR), dan `!` (NOT) dalam menentukan pemberian akses WiFi kampus bagi pengguna (mahasiswa atau dosen) yang akunnya tidak diblokir.

#### 2.2.1 Kode Program Java

```java
import java.util.Scanner;

public class operatorLogikaWifiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
}

```

#### 2.2.2 Tabel Hasil Pengujian Data

Berikut adalah hasil uji coba program menggunakan kombinasi masukan yang telah ditentukan:

| Uji | mahasiswa | dosen | akunDiblokir | Output yang Dihasilkan |
| --- | --- | --- | --- | --- |
| 1 | `true` | `false` | `false` | Akses WiFi diberikan

 |
| 2 | `false` | `true` | `false` | Akses WiFi diberikan

 |
| 3 | `true` | `false` | `true` | Akses WiFi ditolak

 |
| 4 | `false` | `false` | `false` | Akses WiFi ditolak

 |

#### 2.2.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Jelaskan fungsi operator `||`, `&&`, dan `!` pada kondisi program tersebut!


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai `mahasiswa = false`?


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 3:** Ubah operator `||` menjadi `&&`. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 4:** Pada ekspresi `mahasiswa || dosen`, kapan kondisi `dosen` tidak perlu dievaluasi? Jelaskan berdasarkan *short-circuit evaluation*!


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 5:** Pada ekspresi `(mahasiswa || dosen) && !akunDiblokir`, kapan kondisi `!akunDiblokir` tidak perlu dievaluasi? Jelaskan!


* **Jawab:** [Tuliskan jawaban Anda di sini]



---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Percobaan ini menggabungkan struktur *Nested IF* dan operator logika untuk menentukan izin akses laboratorium bagi mahasiswa aktif yang tidak sedang disanksi, serta memiliki izin dosen atau berstatus asisten lab.

#### 2.3.1 Kode Program Java

```java
import java.util.Scanner;

public class nestedAksesLabNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}

```

#### 2.3.2 Hasil Running / Screenshot Output

#### 2.3.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Mengapa pemeriksaan `punyaIzinDosen || asistenLab` ditempatkan di dalam `IF` pertama?


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 2:** Jelaskan fungsi operator `&&`, `||`, dan `!` pada program tersebut!


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)`? Jelaskan apakah keputusan akses akhirnya sama!


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 4:** Apa keuntungan menggunakan *Nested IF* pada kasus ini dibandingkan hanya satu *IF* jika sistem perlu menampilkan alasan penolakan yang berbeda?


* **Jawab:** [Tuliskan jawaban Anda di sini]


* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua!


* **Jawab:** [Tuliskan jawaban Anda di sini]



---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas mandiri yang harus dikerjakan:

* [x] **Tugas 1:** Implementasi flowchart sistem diskon toko buku menggunakan struktur pemilihan bersarang (*Nested IF*).


* [x] **Tugas 2:** Program Java sistem seleksi calon asisten praktikum bertahap (`tugas2SeleksiAsistenNoPresensi.java`).



### 3.1 Implementasi Kode Tugas 1 (Sistem Diskon Toko Buku)

```java
// Tuliskan kode program Java Tugas 1 di sini

```

### 3.2 Implementasi Kode Tugas 2 (Sistem Seleksi Asisten Praktikum)

```java
// Tuliskan kode program Java Tugas 2 di sini

```

---

## 4: KESIMPULAN

[Tuliskan paragraf kesimpulan mengenai pengalaman praktikum dan pemahaman terhadap materi Pemilihan Bersarang / Nested IF serta Operator Logika di sini]

```

```

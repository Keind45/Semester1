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
![foto hasil pemrograman](/nested2.png)

#### 2.1.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian? 


* **Jawab:** Jika menjawab "No", program langsung menampilkan pesan bahwa mahasiswa masih memiliki tanggungan kompen. Pemeriksaan jumlah bimbingan tidak menjadi penentu karena syarat bebas kompen belum terpenuhi.


* **Pertanyaan 2:** Jelaskan maksud dari potongan kode `if (bimbinganP1 >= 8 && bimbinganP2 >= 4)`!


* **Jawab:** Kondisi tersebut digunakan untuk memeriksa apakah jumlah bimbingan dengan Pembimbing 1 minimal 8 kali dan dengan Pembimbing 2 minimal 4 kali. Jika kedua kondisi terpenuhi, mahasiswa dinyatakan memenuhi syarat untuk mendaftar ujian skripsi.


* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!


* **Jawab:** Pertama, program memeriksa apakah mahasiswa sudah bebas kompen. Jika belum, program menampilkan bahwa mahasiswa masih memiliki tanggungan kompen. Jika sudah bebas kompen, program memeriksa jumlah bimbingan Pembimbing 1 dan Pembimbing 2. Jika keduanya memenuhi batas minimal, mahasiswa diperbolehkan mendaftar ujian. Jika salah satu atau keduanya belum memenuhi, program menampilkan alasan kegagalannya.



---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Percobaan ini bertujuan untuk menerapkan operator logika `&&` (AND), `||` (OR), dan `!` (NOT) dalam menentukan pemberian akses WiFi kampus bagi pengguna (mahasiswa atau dosen) yang akunnya tidak diblokir.

#### 2.2.1 Kode Program Java

```java
import java.util.Scanner;

public class operatorLogikaWifi01 {
    public static void main(String[] args) {
        boolean mahasiswa, dosen, akunDiblokir;       

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.println("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.println("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }
    }
}

```

#### 2.2.2 Tabel Hasil Pengujian Data

Berikut adalah hasil uji coba program menggunakan kombinasi masukan yang telah ditentukan:

| Uji | mahasiswa | dosen | akunDiblokir | Output yang Dihasilkan |
| --- | --- | --- | --- | --- |
| 1 | `true` | `false` | `false` | Akses WiFi diberikan|
| 2 | `false` | `true` | `false` | Akses WiFi diberikan|
| 3 | `true` | `false` | `true` | Akses WiFi ditolak|
| 4 | `false` | `false` | `false` | Akses WiFi ditolak|

#### 2.2.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Jelaskan fungsi operator `||`, `&&`, dan `!` pada kondisi program tersebut!


* **Jawab:** Operator || berarti OR, yaitu salah satu kondisi harus bernilai true. Operator && berarti AND, yaitu semua kondisi yang digabungkan harus bernilai true. Operator ! berarti NOT, yaitu membalik nilai boolean menjadi kebalikannya.


* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai `mahasiswa = false`?


* **Jawab:** Karena program menggunakan operator ||. Jika mahasiswa = false tetapi dosen = true, maka kondisi (mahasiswa || dosen) tetap bernilai true. Selama akun tidak diblokir, akses WiFi diberikan.


* **Pertanyaan 3:** Ubah operator `||` menjadi `&&`. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?


* **Jawab:** Akses WiFi akan ditolak pada data uji 1 dan 2. Hal tersebut terjadi karena operator && mengharuskan nilai mahasiswa dan dosen sama-sama true, sedangkan pada data uji 1 hanya mahasiswa yang true dan pada data uji 2 hanya dosen yang true.


* **Pertanyaan 4:** Pada ekspresi `mahasiswa || dosen`, kapan kondisi `dosen` tidak perlu dievaluasi? Jelaskan berdasarkan *short-circuit evaluation*!


* **Jawab:** Kondisi dosen tidak perlu dievaluasi ketika mahasiswa sudah bernilai true. Karena menggunakan operator ||, satu kondisi true sudah cukup untuk membuat keseluruhan ekspresi bernilai true.


* **Pertanyaan 5:** Pada ekspresi `(mahasiswa || dosen) && !akunDiblokir`, kapan kondisi `!akunDiblokir` tidak perlu dievaluasi? Jelaskan!


* **Jawab:** Kondisi !akunDiblokir tidak perlu dievaluasi ketika (mahasiswa || dosen) bernilai false. Karena menggunakan operator &&, jika kondisi pertama sudah false, keseluruhan kondisi pasti false.



---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Percobaan ini menggabungkan struktur *Nested IF* dan operator logika untuk menentukan izin akses laboratorium bagi mahasiswa aktif yang tidak sedang disanksi, serta memiliki izin dosen atau berstatus asisten lab.

#### 2.3.1 Kode Program Java

```java
import java.util.Scanner;

public class nestedAksesLab01 {
    public static void main(String[] args) {
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        Scanner sc =  new Scanner(System.in);
        
        System.out.println("apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.println("apakah sedang di sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.println("apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.println("apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium di berikan");
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
![Foto Percobaan 1](/nested.png)

#### 2.3.3 Jawaban Pertanyaan Refleksi

* **Pertanyaan 1:** Mengapa pemeriksaan `punyaIzinDosen || asistenLab` ditempatkan di dalam `IF` pertama?


* **Jawab:** Karena pemeriksaan izin dosen atau status asisten lab hanya dilakukan jika mahasiswa sudah memenuhi syarat pertama, yaitu mahasiswa aktif dan tidak sedang disanksi.


* **Pertanyaan 2:** Jelaskan fungsi operator `&&`, `||`, dan `!` pada program tersebut!


* **Jawab:** Operator && digunakan untuk memastikan mahasiswa aktif dan tidak sedang disanksi. Operator || digunakan agar mahasiswa cukup memiliki izin dosen atau berstatus asisten lab. Operator ! digunakan untuk membalik nilai sedangDisanksi, sehingga kondisi !sedangDisanksi bernilai true ketika mahasiswa tidak sedang disanksi.


* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)`? Jelaskan apakah keputusan akses akhirnya sama!


* **Jawab:** Ya, syarat tersebut dapat ditulis menjadi satu kondisi. Keputusan akhirnya tetap sama karena semua syarat yang diperlukan tetap harus terpenuhi. Perbedaannya, Nested IF lebih mudah digunakan jika program perlu memberikan alasan penolakan yang berbeda.


* **Pertanyaan 4:** Apa keuntungan menggunakan *Nested IF* pada kasus ini dibandingkan hanya satu *IF* jika sistem perlu menampilkan alasan penolakan yang berbeda?


* **Jawab:** Nested IF memungkinkan program memeriksa syarat secara bertahap dan memberikan alasan penolakan yang lebih spesifik. Misalnya, program dapat membedakan antara mahasiswa yang tidak memenuhi syarat status dengan mahasiswa yang tidak memiliki izin dosen atau bukan asisten lab.


* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua!


* **Jawab:** Ditolak level pertama: mahasiswaAktif = false, sedangDisanksi = false, punyaIzinDosen = true, asistenLab = false.
Ditolak level kedua: mahasiswaAktif = true, sedangDisanksi = false, punyaIzinDosen = false, asistenLab = false.



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

Pada Jobsheet 6 ini dapat disimpulkan bahwa struktur Nested IF digunakan untuk melakukan pemeriksaan kondisi secara bertahap sesuai dengan syarat yang telah ditentukan. Selain itu, operator logika &&, ||, dan ! dapat digunakan untuk menggabungkan serta memanipulasi beberapa kondisi dalam program. Dengan menerapkan Nested IF dan operator logika, program dapat menghasilkan keputusan yang lebih terstruktur serta menampilkan alasan yang sesuai ketika suatu syarat tidak terpenuhi.

```
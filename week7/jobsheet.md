# JOBSHEET 6 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**
* **Nama:** ACHMAD KAKA ANDRIAN
* **NIM:** 264107020210
* **Kelas / No. Presensi:** TI-1D / 01
* **Username GitHub:** Keind45
* **Link Repository:** https://github.com/Keind45/Semester1

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan studi kasus menggunakan struktur pemilihan dasar dan pemilihan bersarang.
2. Mahasiswa mampu menyimpan dan mengumpulkan pekerjaan menggunakan Git dan GitHub melalui Visual Studio Code.
3. Mahasiswa mampu berkolaborasi dengan teman menggunakan GitHub.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Persiapan Awal (Akun GitHub, Git, dan Identitas Git)

Pada tahap ini, mahasiswa menyiapkan akun GitHub, menginstal Git, dan mengatur identitas Git (nama dan email) di Visual Studio Code. Langkah ini hanya dilakukan sekali di setiap laptop/PC.

#### 2.1.1 Perintah yang Digunakan
```bash
git config --global user.name "Keind45"
git config --global user.email "dgvinzs@gmail.com"
```

#### 2.1.2 Screenshot Hasil
![Akun GitHub](./gambar/persiapan_github.png)
![Instalasi Git](./gambar/persiapan_git.png)
![Konfigurasi Identitas Git](./gambar/persiapan_config.png)

#### 2.1.3 Catatan / Kendala
* Tidak ada kendala.

---

### 2.2 Percobaan 1: Menyiapkan Repository

Pada percobaan ini, mahasiswa membuat repository `PraktikumDaspro01` di GitHub, melakukan *clone* ke komputer melalui VS Code, membuat file `README.md`, lalu melakukan proses *add*, *commit*, dan *push*.

#### 2.2.1 Isi File README.md
```markdown
Ini adalah repository pertama saya
Nama  : ACHMAD KAKA ANDRIAN
NIM   : 264107020210
Kelas : TI-1D
```

#### 2.2.2 Screenshot Hasil
| Langkah | Screenshot |
| --- | --- |
| Membuat repository baru di GitHub | ![Create Repository](./gambar/p1_create_repo.png) |
| Clone repository di VS Code | ![Clone](./gambar/p1_clone.png) |
| File README.md berstatus `U` (Untracked) | ![Untracked](./gambar/p1_untracked.png) |
| Stage Changes (status `A`) | ![Stage](./gambar/p1_stage.png) |
| Commit dengan commit message | ![Commit](./gambar/p1_commit.png) |
| Push / Publish Branch | ![Push](./gambar/p1_push.png) |
| README.md tampil di GitHub | ![GitHub README](./gambar/p1_github.png) |

#### 2.2.3 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Apa perbedaan antara *Add (Stage)*, *Commit*, dan *Push*?
* **Jawab:** *Add (Stage)* memilih perubahan file yang akan disimpan dengan memasukkannya ke staging area. *Commit* menyimpan perubahan yang sudah di-stage sebagai versi baru di local repository (komputer sendiri). *Push* mengirim commit dari local repository ke GitHub sehingga bisa dilihat secara online.

* **Pertanyaan 2:** Apa arti status huruf `U` dan `A` pada file di VS Code?
* **Jawab:** `U` (Untracked) berarti file baru yang belum dilacak oleh Git. `A` (Added) berarti file sudah dimasukkan ke staging area dan siap di-commit.

* **Pertanyaan 3:** Mengapa identitas Git (`user.name` dan `user.email`) perlu diatur sebelum melakukan commit?
* **Jawab:** Karena identitas tersebut dicatat sebagai pembuat setiap commit. Jika belum diatur, Git menolak commit dan menampilkan pesan agar `user.name` dan `user.email` dikonfigurasi terlebih dahulu.

---

### 2.3 Percobaan 2: Studi Kasus 1 - Pemilihan Dasar (Kasir Kedai Kopi Senja)

Pada percobaan ini, mahasiswa membuat program kasir sederhana untuk menghitung total bayar dan kembalian. Harga Kopi Susu Gula Aren adalah Rp18.000 per cup, dengan diskon 10% untuk pembelian minimal Rp100.000.

#### 2.3.1 Kode Program Java (`StudiKasus101.java`)
```java
import java.util.Scanner;

public class StudiKasus101 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}
```

#### 2.3.2 Hasil Running / Screenshot Output
![Output Studi Kasus 1](./gambar/sk1_output.png)

#### 2.3.3 Tabel Hasil Pengujian Data

| Uji | jumlahCup | uangBayar | Total Harga | Diskon | Total Bayar | Output Kembalian / Kurang |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | 3 | 50000 | Rp 54000 | Rp 0 | Rp 54000 | Uang tidak cukup, kurang Rp 4000 |
| 2 | 6 | 100000 | Rp 108000 | Rp 10800 | Rp 97200 | Kembalian Rp 2800 |
| 3 | 5 | 100000 | Rp 90000 | Rp 0 | Rp 90000 | Kembalian Rp 10000 |

#### 2.3.4 Riwayat Commit
| No | Commit Message | Keterangan |
| --- | --- | --- |
| 1 | `SK1: input dan deklarasi variabel` | Commit setelah input dan deklarasi variabel selesai dibuat |
| 2 | `SK1: logika diskon dan kembalian` | Commit setelah logika pemilihan diskon dan kembalian selesai |

![Riwayat Commit SK1](./gambar/sk1_commit.png)

#### 2.3.5 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Pada jumlah cup berapa diskon mulai diberikan? Jelaskan perhitungannya!
* **Jawab:** Diskon mulai diberikan pada 6 cup. Untuk 5 cup, total harga 5 x 18000 = Rp 90000 (kurang dari Rp 100000), sedangkan untuk 6 cup total harga 6 x 18000 = Rp 108000 (memenuhi syarat >= 100000), sehingga diskon 10% = Rp 10800.

* **Pertanyaan 2:** Mengapa variabel `diskon` diberi nilai awal `0` sebelum pemeriksaan kondisi?
* **Jawab:** Agar `diskon` selalu punya nilai, meskipun kondisi `totalHarga >= 100000` tidak terpenuhi. Jika tidak diberi nilai awal, variabel bisa belum terisi saat `totalBayar = totalHarga - diskon` dihitung, sehingga terjadi error.

* **Pertanyaan 3:** Jelaskan alur program dari input sampai output sesuai flowchart!
* **Jawab:** Program menerima input jumlahCup dan uangBayar, lalu menghitung totalHarga dan mengatur diskon = 0. Jika totalHarga >= 100000, diskon dihitung 10% dari totalHarga. Selanjutnya totalBayar dihitung dari totalHarga dikurangi diskon, lalu totalHarga, diskon, dan totalBayar ditampilkan. Terakhir, jika uangBayar >= totalBayar program menampilkan kembalian, jika tidak program menampilkan pesan uang tidak cukup beserta jumlah kekurangannya.

---

### 2.4 Percobaan 3: Studi Kasus 2 - Pemilihan Bersarang (Validasi Dana Penghargaan Prestasi)

Pada percobaan ini, mahasiswa membuat program untuk mengecek status dana penghargaan prestasi mahasiswa menggunakan *Nested IF* (kedalaman maksimal 3 tingkat). Program hanya menanyakan data yang diperlukan sesuai jenis kegiatan.

#### 2.4.1 Kode Program Java (`StudiKasus201.java`)
```java
import java.util.Scanner;

public class StudiKasus201 {
    public static void main(String[] args) {
        String nama, jenis, status;
        int jumlahDokumen, peringkat, statusPKM;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine().trim();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            // Cabang lomba
            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if (jumlahDokumen >= 4) {
                if (peringkat >= 1 && peringkat <= 3) {
                    status = "Berhak memperoleh dana penghargaan (Juara " + peringkat + ").";
                } else {
                    status = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
                }
            } else {
                status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            // Cabang PKM
            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen >= 4) {
                if (statusPKM == 1) {
                    status = "Berhak memperoleh dana penghargaan (PKM lolos pendanaan).";
                } else {
                    status = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
                }
            } else {
                status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            }
        } else {
            // Cabang Lainnya
            status = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        System.out.println("Status : " + status);
    }
}
```

#### 2.4.2 Hasil Running / Screenshot Output
![Output Studi Kasus 2](./gambar/sk2_output.png)

#### 2.4.3 Tabel Hasil Pengujian Data

| Uji | Jenis Kegiatan | Dokumen | Peringkat / Pendanaan | Output yang Dihasilkan |
| --- | --- | --- | --- | --- |
| 1 | BAKORMA | 3 | Juara 1 | Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan. |
| 2 | Mandiri | 4 | 0 (bukan juara) | Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3). |
| 3 | pkm | 4 | 1 (lolos) | Berhak memperoleh dana penghargaan (PKM lolos pendanaan). |
| 4 | Lainnya | 4 | (tidak ditanyakan) | Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan). |

#### 2.4.4 Riwayat Commit
| No | Commit Message | Keterangan |
| --- | --- | --- |
| 1 | `SK2: cabang lomba` | Commit setelah cabang lomba (BELMAWA, BAKORMA, Mandiri) selesai |
| 2 | `SK2: cabang PKM dan lainnya` | Commit setelah cabang PKM dan Lainnya selesai |

![Riwayat Commit SK2](./gambar/sk2_commit.png)

#### 2.4.5 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Mengapa pengecekan jumlah dokumen dilakukan sebelum pengecekan peringkat/status PKM?
* **Jawab:** Karena kelengkapan 4 dokumen adalah syarat wajib. Jika dokumen kurang dari 4, dana tidak diberikan meskipun mahasiswa juara atau PKM-nya lolos, sehingga pengecekan peringkat/status PKM tidak lagi menentukan hasil.

* **Pertanyaan 2:** Bagaimana program menangani input jenis kegiatan dengan huruf besar/kecil yang berbeda?
* **Jawab:** Program memakai `equalsIgnoreCase()` untuk membandingkan teks, sehingga "bakorma", "BAKORMA", maupun "Bakorma" dianggap sama. Input juga dirapikan dengan `trim()` untuk menghapus spasi di awal dan akhir.

* **Pertanyaan 3:** Bagaimana program menghitung jumlah dokumen yang masih kurang?
* **Jawab:** Dengan mengurangkan jumlah dokumen wajib dengan jumlah dokumen yang diupload, yaitu `4 - jumlahDokumen`. Misalnya dokumen yang diupload 3, maka kurang 1 dokumen.

* **Pertanyaan 4:** Mengapa pada jenis kegiatan "Lainnya" program tidak perlu menanyakan jumlah dokumen dan peringkat?
* **Jawab:** Karena kegiatan "Lainnya" tidak memenuhi ketentuan a maupun b, sehingga pasti tidak memperoleh dana penghargaan. Berapa pun jumlah dokumen dan peringkatnya tidak mengubah hasil, jadi pertanyaan tersebut tidak diperlukan.

---

### 2.5 Percobaan 4: Uji Silang Program Teman

Pada percobaan ini, mahasiswa berpasangan dan bergantian: pemilik repository mengundang teman sebagai *collaborator*, lalu teman menguji program `StudiKasus201.java` dan menuliskan hasil uji di `README.md`.

#### 2.5.1 Data Kolaborasi
* **Username teman (collaborator):** [Isi Username Teman]
* **Nama teman:** [Isi Nama Teman]
* **Repository teman yang diuji:** [Isi Link Repository Teman]

#### 2.5.2 Screenshot Hasil
| Langkah | Screenshot |
| --- | --- |
| Add collaborator (Settings > Collaborators) | ![Add Collaborator](./gambar/p4_collaborator.png) |
| Accept invitation | ![Accept Invitation](./gambar/p4_accept.png) |
| Clone repository teman | ![Clone Teman](./gambar/p4_clone.png) |
| Hasil uji di README.md | ![README Hasil Uji](./gambar/p4_readme.png) |
| Pull hasil uji dari teman | ![Pull](./gambar/p4_pull.png) |
| Riwayat commit (commit teman tercatat) | ![Commits](./gambar/p4_commits.png) |

#### 2.5.3 Hasil Uji pada README.md


Hasil Uji Studi Kasus 2 oleh ACHMAD KAKA ANDRIAN

| No | Jenis   | Dokumen | Juara/Dana        | Output                                                                  | Sesuai? |
|----|---------|---------|-------------------|-------------------------------------------------------------------------|---------|
| 1  | BAKORMA | 3       | Juara 1           | Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan. | Ya  |
| 2  | Mandiri | 4       | 0 (bukan juara)   | Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).            | Ya      |
| 3  | pkm     | 4       | 1 (lolos)         | Berhak memperoleh dana penghargaan (PKM lolos pendanaan).               | Ya      |
| 4  | Lainnya | 4       | (tidak ditanyakan) | Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan). | Ya |


#### 2.5.4 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Mengapa pemilik repository perlu melakukan *Pull* sebelum mengubah `README.md`?
* **Jawab:** untuk sinkronisasi kode dan mencegah terjadinya rusaknya file.

* **Pertanyaan 2:** Apakah ada hasil uji yang tidak sesuai? Jika ada, apa perbaikan yang dilakukan?
* **Jawab:** Tidak ada.

* **Pertanyaan 3:** Apa manfaat GitHub sebagai sarana kolaborasi dibandingkan mengirim file secara manual?
* **Jawab:** GitHub lebih cepat dan lebih aman dan bisa melihat log kegiatan yang di lakukan pada file itu sehingga lebih aman.

---

### 2.6 Ringkasan Tombol Git di VS Code

| Proses Git | Fungsi | Tombol di VS Code |
| --- | --- | --- |
| Clone | Menduplikasi repository GitHub ke komputer | Welcome > Clone Git Repository > paste URL > Clone from URL |
| Add (Stage) | Memilih perubahan yang akan di-commit | Source Control > ikon `+` di samping file |
| Commit | Menyimpan versi baru di local repository | Isi Commit Message > tombol Commit |
| Push | Mengirim commit dari lokal ke GitHub | `...` > Push, atau Commit v > Commit & Push |
| Pull | Mengambil versi terbaru dari GitHub | `...` > Pull |
| Sync | Pull lalu Push sekaligus | Tombol Sync Changes |
| Discard | Membatalkan perubahan yang belum di-commit | Ikon Discard Changes di samping file |

---

## 3: KESIMPULAN

Pada Jobsheet 6 ini dapat disimpulkan bahwa struktur pemilihan dasar digunakan untuk menentukan diskon dan kembalian pada program kasir, sedangkan Nested IF digunakan untuk memeriksa syarat secara bertahap pada validasi dana penghargaan prestasi, sehingga program dapat menampilkan alasan yang sesuai. Selain itu, Git dan GitHub melalui Visual Studio Code memudahkan penyimpanan pekerjaan dengan alur clone, add, commit, push, dan pull. Kolaborasi menggunakan GitHub juga memungkinkan teman menguji program dan mencatat hasilnya langsung di repository, serta setiap perubahan tercatat dalam riwayat commit.

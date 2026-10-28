# JOBSHEET 6 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**
* **Nama:** ACHMAD KAKA ANDRIAN
* **NIM:** 264107020210
* **Kelas / No. Presensi:** TI-1D / 01

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
* [Tuliskan kendala saat instalasi atau konfigurasi (jika ada), atau tulis "Tidak ada kendala"]

---

### 2.2 Percobaan 1: Menyiapkan Repository

Pada percobaan ini, mahasiswa membuat repository `PraktikumDaspro[NoPresensi]` di GitHub, melakukan *clone* ke komputer melalui VS Code, membuat file `README.md`, lalu melakukan proses *add*, *commit*, dan *push*.

#### 2.2.1 Isi File README.md
```markdown
Ini adalah repository pertama saya
Nama  : [Isi Nama]
NIM   : [Isi NIM]
Kelas : [Isi Kelas]
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
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 2:** Apa arti status huruf `U` dan `A` pada file di VS Code?
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 3:** Mengapa identitas Git (`user.name` dan `user.email`) perlu diatur sebelum melakukan commit?
* **Jawab:** [Tuliskan jawaban]

---

### 2.3 Percobaan 2: Studi Kasus 1 - Pemilihan Dasar (Kasir Kedai Kopi Senja)

Pada percobaan ini, mahasiswa membuat program kasir sederhana untuk menghitung total bayar dan kembalian. Harga Kopi Susu Gula Aren adalah Rp18.000 per cup, dengan diskon 10% untuk pembelian minimal Rp100.000.

#### 2.3.1 Kode Program Java (`StudiKasus1[NoPresensi].java`)
```java
import java.util.Scanner;

public class StudiKasus1[NoPresensi] {
    public static void main(String[] args) {
        // [Deklarasi variabel sesuai flowchart]

        // [Input jumlahCup dan uangBayar]

        // [Hitung totalHarga dan diskon]

        // [Pemilihan: totalHarga >= 100000 ?]

        // [Hitung totalBayar dan tampilkan output]

        // [Pemilihan: uangBayar >= totalBayar ? kembalian : kurang]
    }
}
```

#### 2.3.2 Hasil Running / Screenshot Output
![Output Studi Kasus 1](./gambar/sk1_output.png)

#### 2.3.3 Tabel Hasil Pengujian Data

| Uji | jumlahCup | uangBayar | Total Harga | Diskon | Total Bayar | Output Kembalian / Kurang |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | 3 | 50000 | Rp 54000 | Rp 0 | Rp 54000 | Uang tidak cukup, kurang Rp 4000 |
| 2 | [isi] | [isi] | [isi] | [isi] | [isi] | [isi] |
| 3 | [isi] | [isi] | [isi] | [isi] | [isi] | [isi] |

#### 2.3.4 Riwayat Commit
| No | Commit Message | Keterangan |
| --- | --- | --- |
| 1 | `SK1: input dan deklarasi variabel` | [isi] |
| 2 | `SK1: logika diskon dan kembalian` | [isi] |

![Riwayat Commit SK1](./gambar/sk1_commit.png)

#### 2.3.5 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Pada jumlah cup berapa diskon mulai diberikan? Jelaskan perhitungannya!
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 2:** Mengapa variabel `diskon` diberi nilai awal `0` sebelum pemeriksaan kondisi?
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 3:** Jelaskan alur program dari input sampai output sesuai flowchart!
* **Jawab:** [Tuliskan jawaban]

---

### 2.4 Percobaan 3: Studi Kasus 2 - Pemilihan Bersarang (Validasi Dana Penghargaan Prestasi)

Pada percobaan ini, mahasiswa membuat program untuk mengecek status dana penghargaan prestasi mahasiswa menggunakan *Nested IF* (kedalaman maksimal 3 tingkat). Program hanya menanyakan data yang diperlukan sesuai jenis kegiatan.

#### 2.4.1 Kode Program Java (`StudiKasus2[NoPresensi].java`)
```java
import java.util.Scanner;

public class StudiKasus2[NoPresensi] {
    public static void main(String[] args) {
        // [Deklarasi variabel: nama, jenisKegiatan, jumlahDokumen, peringkat, statusPKM]

        // [Input nama, jenis kegiatan, dan jumlah dokumen]

        // [Cabang lomba: BELMAWA / BAKORMA / Mandiri -> cek dokumen, cek peringkat]

        // [Cabang PKM -> cek dokumen, cek status pendanaan]

        // [Cabang Lainnya -> tidak memperoleh dana]
    }
}
```

#### 2.4.2 Hasil Running / Screenshot Output
![Output Studi Kasus 2](./gambar/sk2_output.png)

#### 2.4.3 Tabel Hasil Pengujian Data

| Uji | Jenis Kegiatan | Dokumen | Peringkat / Pendanaan | Output yang Dihasilkan |
| --- | --- | --- | --- | --- |
| 1 | BAKORMA | 3 | Juara 1 | [isi output] |
| 2 | Mandiri | 4 | 0 (bukan juara) | [isi output] |
| 3 | pkm | 4 | 1 (lolos) | [isi output] |
| 4 | Lainnya | 4 | (tidak ditanyakan) | [isi output] |

#### 2.4.4 Riwayat Commit
| No | Commit Message | Keterangan |
| --- | --- | --- |
| 1 | `SK2: cabang lomba` | [isi] |
| 2 | `SK2: cabang PKM dan lainnya` | [isi] |

![Riwayat Commit SK2](./gambar/sk2_commit.png)

#### 2.4.5 Jawaban Pertanyaan Analisis

* **Pertanyaan 1:** Mengapa pengecekan jumlah dokumen dilakukan sebelum pengecekan peringkat/status PKM?
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 2:** Bagaimana program menangani input jenis kegiatan dengan huruf besar/kecil yang berbeda?
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 3:** Bagaimana program menghitung jumlah dokumen yang masih kurang?
* **Jawab:** [Tuliskan jawaban]

* **Pertanyaan 4:** Mengapa pada jenis kegiatan "Lainnya" program tidak perlu menanyakan jumlah dokumen dan peringkat?
* **Jawab:** [Tuliskan jawaban]

---

### 2.5 Percobaan 4: Uji Silang Program Teman

Pada percobaan ini, mahasiswa berpasangan dan bergantian: pemilik repository mengundang teman sebagai *collaborator*, lalu teman menguji program `StudiKasus2[NoPresensi].java` dan menuliskan hasil uji di `README.md`.

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

```markdown
Hasil Uji Studi Kasus 2 oleh [Nama Penguji]

| No | Jenis | Dokumen | Juara/Dana | Output | Sesuai? |
|----|-------|---------|------------|--------|---------|
| 1  | [isi] | [isi]   | [isi]      | [isi]  | [Ya/Tidak] |
| 2  | [isi] | [isi]   | [isi]      | [isi]  | [Ya/Tidak] |
| 3  | [isi] | [isi]   | [isi]      | [isi]  | [Ya/Tidak] |
```

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

[Tuliskan kesimpulan dengan bahasa sendiri. Beberapa poin yang bisa dibahas:
1. Penggunaan struktur pemilihan dasar dan Nested IF pada studi kasus kasir dan validasi dana penghargaan.
2. Alur kerja Git (clone, add, commit, push, pull) melalui VS Code.
3. Manfaat kolaborasi menggunakan GitHub (collaborator, pull, riwayat commit).]

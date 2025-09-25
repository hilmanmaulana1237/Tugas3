# 📱 Tugas 3 — Relative/Constraint Layout, Activity, Explicit & Implicit Intent

## 👤 Pembuat
**Hilman Maulana** — UIN Sunan Gunung Djati Bandung  
Kelas: **Pengembangan Aplikasi Web (D)** • NIM: **1237050020**

---

## 🖼️ Preview
![Preview Main (Portrait)](preview3a.png)
![Preview Main (Landscape)](preview3b.png)
![Preview Activity Kedua](preview3c.png)

> Letakkan gambar di root repo atau folder `preview/` lalu sesuaikan path-nya.

---

## 📚 Deskripsi Singkat
Implementasi:
- **Layout ganda** (portrait & landscape) menggunakan **ConstraintLayout** *(atau RelativeLayout sesuai materi)*
- **Activity kedua (`MainActivity2`)** dengan **Explicit Intent** dari `MainActivity`
- **Implicit Intent**:
  - **Browser** (`ACTION_VIEW` + URL)
  - **Map** (`ACTION_VIEW` + `geo:` URI)
  - **Dialer** (`ACTION_DIAL` + `tel:`)
  - **Share** (`ACTION_SEND` + `text/plain`)
- **Counter & Toast** pada halaman utama

---

## 🧩 Fitur
- Tombol **Count** menambah angka pada `TextView`
- Tombol **Toast** menampilkan nilai saat ini
- Tombol **Switch Page** membuka `MainActivity2` (explicit)
- Tombol **Browse / Map / Dial / Share** menjalankan implicit intent

---

## 🗂️ Struktur Proyek

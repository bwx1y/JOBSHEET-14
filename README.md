# Jobsheet 14

## Percobaan 1

1. Apa yang dimaksud dengan fungsi rekursif?

rekusif adalah fungsi yang memanggil dirinya sendiri 

2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif? 

Ya, hasil yang diberikan oleh fungsi faktorialRekursIf() dan faktorialIteratIf() adalah sama, yaitu 120 untuk input 5.
Fungsi Rekursif (faktorialRekursIf) Alur kerja:

- Fungsi memanggil dirinya sendiri berulang kali.
- Setiap pemanggilan disimpan di stack memori.
- Proses berhenti saat mencapai kondisi dasar (n == 0).
- Setelah itu, hasil dikembalikan bertahap dari pemanggilan terakhir ke awal.

Fungsi Iteratif (faktorialIteratIf) Alur kerja:
- Menggunakan perulangan (for)
- Perhitungan dilakukan langsung dalam satu fungsi
- Tidak ada pemanggilan fungsi berulang
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

## Percobaan 2

1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Alur Kerja:
- Fungsi pertama kali dipanggil dari main dengan:
- Selama nilai y > 0, fungsi akan memanggil dirinya sendiri, Mengurangi nilai y sebanyak 1 setiap pemanggilan
- Proses ini berulang terus hingga y == 0


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

2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

```java
public class Percobaan2 {
    static int hitungPangkat (int x, int y) {
        if (y ==0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x + "x");
            return (x* hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println("=" + hitungPangkat(bilangan, pangkat));
    }
}
```

## Percobaan 3

1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”! 

- Base Case:
```
if (tahun == 0) {
    return saldo;
}
```

- Recursion Call: 
```
return 1.11 * hitungLaba(saldo, tahun - 1);
```

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)

- Fase Ekspansi: 
```
hitungLaba(100000, 3)
= 1.11 * hitungLaba(100000, 2)

hitungLaba(100000, 2)
= 1.11 * hitungLaba(100000, 1)

hitungLaba(100000, 1)
= 1.11 * hitungLaba(100000, 0)

hitungLaba(100000, 0)
= 100000   ← base case
```

- Fase Substitusi:
```
hitungLaba(100000, 0)
= 100000

hitungLaba(100000, 1)
= 1.11 × 100000
= 111000

hitungLaba(100000, 2)
= 1.11 × 111000
= 123210

hitungLaba(100000, 3)
= 1.11 × 123210
= 136763.1
```

- Hasil Akhir
```
hitungLaba(100000, 3) = 136763.1
```


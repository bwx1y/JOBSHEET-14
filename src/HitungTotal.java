import java.util.Scanner;

public class HitungTotal {
    static int hitungIteratif(int n, Scanner sc) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            total += sc.nextInt();
        }
        return total;
    }

    static int hitungRekursif(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + hitungRekursif(n - 1, sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int total = hitungRekursif(n, sc);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }
}
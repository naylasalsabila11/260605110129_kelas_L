
import java.util.Scanner;

public class Kalkulator {

    static long faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    static long pangkat(int a, int b) {
        long hasil = 1;

        for (int i = 1; i <= b; i++) {
            hasil = hasil * a;
        }

        return hasil;
    }

    static void perkalianMatriks(Scanner input) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Input Matriks A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Input Matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Hasil Perkalian Matriks:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("  KALKULATOR MATEMATIKA  ");
            System.out.println("1. Hitung Faktorial");
            System.out.println("2. Hitung Perpangkatan");
            System.out.println("3. Perkalian Matriks 2x2");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan: ");
                    int n = input.nextInt();

                    if (n < 0 || n > 20) {
                        System.out.println("Masukkan angka 0 sampai 20!");
                    } else {
                        System.out.println("Hasil faktorial = " + faktorial(n));
                    }
                    break;

                case 2:
                    System.out.print("Masukkan bilangan pokok: ");
                    int a = input.nextInt();

                    System.out.print("Masukkan bilangan pangkat: ");
                    int b = input.nextInt();

                    if (b < 0) {
                        System.out.println("Pangkat tidak boleh negatif!");
                    } else {
                        System.out.println("Hasil perpangkatan = " + pangkat(a, b));
                    }
                    break;

                case 3:
                    perkalianMatriks(input);
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}

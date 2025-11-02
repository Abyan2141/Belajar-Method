import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        char ulang;

        do {
            System.out.println("\nMau Menghitung Luas Apa?");
            System.out.println("1. Luas Persegi(s)");
            System.out.println("2. Luas Persegi(p, l)");
            System.out.println("3. Luas Segitiga(a, t)");
            System.out.println("4. Luas Lingkaran(r)");
            System.out.print("Pilih : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1 :
                System.out.print("Masukkan sisi Persegi = ");
                int s = in.nextInt();
                luasPersegi(s);
                break;

                case 2 :
                System.out.print("Masukkan panjang Persegi = ");
                int p = in.nextInt();
                System.out.print("Masukkan lebar Persegi = ");
                int l = in.nextInt();
                luasPersegi(p, l);
                break;

                case 3 :
                System.out.print("Masukkan alas Segitiga = ");
                int a = in.nextInt();
                System.out.print("Masukkan tinggi Segitiga = ");
                int t = in.nextInt();
                luasSegitiga(a, t);
                break;

                case 4 :
                System.out.print("Masukkan jari-jari Lingkaran = ");
                double r = in.nextDouble();
                luasLingkaran(r);
                break;

                default :
                System.out.println();
            }
            System.out.println("Ingin Mengulang Program?(Y/N)");
            ulang = in.next().charAt(0);
        }
        while (ulang == 'Y' || ulang == 'y');
    }

    private static void luasPersegi(int s) {
        int luasPersegi = s * s;
        System.out.println("Luas Persegi(s) = " + luasPersegi);
    }
    private static void luasPersegi(int p, int l) {
        int luasPersegi = p * l;
        System.out.println("Luas Persegi(p, l) = " + luasPersegi);
    }
    private static void luasSegitiga(int a, int t) {
        int luasSegitiga = (a * t) / 2;
        System.out.println("Luas Segitiga(a, t) = " + luasSegitiga);
    }
    private static void luasLingkaran(double r) {
        double luasLingkaran = 3.14 * r * r;
        System.out.println("Luas Lingkaran(r) = " + luasLingkaran);
    }
}
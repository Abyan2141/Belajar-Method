public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(12, 4);
        Persegi p = new Persegi(8);
        Lingkaran l = new Lingkaran(4);

        System.out.printf("Luas Segitiga = %.2f\n", s.getLuas());
        System.out.printf("Luas Persegi = %.2f\n", p.getLuas());
        System.out.printf("Luas Lingkaran = %.2f\n", l.getLuas());
    }
}
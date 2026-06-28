package tugas;

// Nama : Muhammad Ryan
// NPM  : 2410010098

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = {
                "Elektronik",
                "Makanan",
                "Minuman"
        };

        System.out.println("=== KATEGORI ===");

        for (String k : kategori) {
            System.out.println(k);
        }

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Laptop", 7000000, 5));

        gudang.tambahBarang(
                new Barang("Mouse", 100000, 20));

        gudang.tambahBarang(
                new Barang("Keyboard", 250000, 10));

        gudang.tambahBarang(
                new Barang("Monitor", 2000000, 4));

        gudang.tambahBarang(
                new Barang("Printer", 1500000, 3));

        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println("\n=== DATA DARI FILE ===");

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println(
                "\nTotal Nilai Persediaan : Rp"
                        + gudangBaru.totalNilai());
    }
}
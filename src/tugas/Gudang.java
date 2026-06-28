package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {

    private ArrayList<Barang> daftarBarang =
            new ArrayList<>();

    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {

        System.out.println("=== DAFTAR BARANG ===");

        for (Barang b : daftarBarang) {
            System.out.println(b.info());
        }
    }

    public void simpanKeBerkas() {

        try (PrintWriter penulis =
                     new PrintWriter(new FileWriter(namaBerkas))) {

            for (Barang b : daftarBarang) {
                penulis.println(b.keBaris());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftarBarang.clear();

        try (BufferedReader pembaca =
                     new BufferedReader(new FileReader(namaBerkas))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                String[] data = baris.split(";");

                daftarBarang.add(
                        new Barang(
                                data[0],
                                Double.parseDouble(data[1]),
                                Integer.parseInt(data[2])
                        )
                );
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public double totalNilai() {

        double total = 0;

        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}
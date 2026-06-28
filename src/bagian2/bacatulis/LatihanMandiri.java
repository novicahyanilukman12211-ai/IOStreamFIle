package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri {

    public static void main(String[] args) {

        String[] namaHari = {
                "Senin",
                "Selasa",
                "Rabu",
                "Kamis",
                "Jumat"
        };

   
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hari.txt"))) {

            for (String hari : namaHari) {
                writer.write(hari);
                writer.newLine();
            }

            System.out.println("Hari kerja berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hari.txt", true))) {

            writer.write("Sabtu");
            writer.newLine();
            writer.write("Minggu");
            writer.newLine();

            System.out.println("Akhir pekan berhasil ditambahkan.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader("hari.txt"))) {

            String isi;
            int nomor = 1;

            System.out.println("\nDaftar Hari:");

            while ((isi = reader.readLine()) != null) {
                System.out.println(nomor + ". " + isi);
                nomor++;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
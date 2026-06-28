package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {

        File fileBaru = new File("dataLatihan.txt");

        try {

            if (!fileBaru.exists()) {
                fileBaru.createNewFile();
                System.out.println("File berhasil dibuat.");
            } else {
                System.out.println("File sudah tersedia.");
            }

            System.out.println("\n=== Informasi File ===");
            System.out.println("Nama File   : " + fileBaru.getName());
            System.out.println("Lokasi File : " + fileBaru.getAbsolutePath());
            System.out.println("Apakah ada? : " + fileBaru.exists());

            boolean hasilHapus = fileBaru.delete();

            if (hasilHapus) {
                System.out.println("\nFile berhasil dihapus.");
            } else {
                System.out.println("\nFile tidak dapat dihapus.");
            }

            System.out.println("Status file setelah dihapus : " + fileBaru.exists());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
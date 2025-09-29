package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void bacaFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String baris;
        while ((baris = reader.readLine()) != null) {
            System.out.println(baris);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile("contoh.txt");
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}

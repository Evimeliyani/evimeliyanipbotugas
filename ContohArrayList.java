package collection;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Evi");
        daftarNama.add("Meliyani");
        daftarNama.add("Java");

        for (String nama : daftarNama) {
            System.out.println("Nama: " + nama);
        }
    }
}

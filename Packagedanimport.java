package packageimport;

import java.util.Scanner;

public class ContohPackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.println("Halo, " + nama + "!");
        scanner.close();
    }
}

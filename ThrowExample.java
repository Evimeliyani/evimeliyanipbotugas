package exception;

public class ThrowExample {
    public static void periksaUmur(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Umur tidak cukup untuk mendaftar.");
        } else {
            System.out.println("Selamat, Anda bisa mendaftar.");
        }
    }

    public static void main(String[] args) {
        periksaUmur(16);
    }
}

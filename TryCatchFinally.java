package exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // Akan menyebabkan ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }
    }
}

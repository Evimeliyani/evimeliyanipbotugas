package exception;

public class JenisException {
    public static void main(String[] args) {
        try {
            int[] angka = new int[3];
            angka[5] = 10; // Akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error: " + e);
        }
    }
}

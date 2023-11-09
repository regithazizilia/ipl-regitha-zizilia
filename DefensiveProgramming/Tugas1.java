public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int result = 3 / 0;
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Terjadi pembagian dengan nol.");
        }
    }

}
import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor; 
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size); 
        for (int i = 0; i < size; i++)
            victor.addElement(i); 
        try {
            this.readList("infile.txt");
            this.writeList();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error saat membaca atau menulis file: " + e.getMessage());
        }
    }

    public void readList(String fileName) throws FileNotFoundException, IOException {
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i); 
            }
        }
    }

    public void writeList() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("outfile.txt"))) {
            for (int i = 0; i < victor.size(); i++) {
                out.write("Value at: " + i + " = " + victor.elementAt(i));
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saat menulis file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ListOfNumbers2 list = new ListOfNumbers2();
    }
}
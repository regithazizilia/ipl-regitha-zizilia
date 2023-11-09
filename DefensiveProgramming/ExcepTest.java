import java.io.*; 

public class ExcepTest { 
    public static void main(String args[]) { 
<<<<<<< HEAD
        try { 
            int a[] = new int[2]; 
            System.out.println("Access element three :" + a[3]); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Exception thrown :" + e); 
        } 
        System.out.println("Out of the block"); 
        
        try { 
            file = new FileInputStream("IPL.txt"); 
            x = (byte) file.read(); 
        } catch (IOException i) { 
            i.printStackTrace(); 
            return -1; 
        } catch (FileNotFoundException f) { // Not valid!  
            f.printStackTrace(); 
            return -1;   
        }
    }
} 

=======
    try { 
        int a[] = new int[2]; 
        System.out.println("Access element three :" + a[3]); 
    } catch (ArrayIndexOutOfBoundsException e) { 
        System.out.println("Exception thrown :" + e); 
    } 
    System.out.println("Out of the block"); 
    } 
} 
>>>>>>> Single-Catch-Block

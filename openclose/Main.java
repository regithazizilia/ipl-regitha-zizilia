public class Main {
    public static void main(String[] args) { 
        StandardCinema standardCinema = new StandardCinema(100.0); 
        Double adminFee = standardCinema.calculateAdminFee(); 
        System.out.println(adminFee); 
        StudentCinema studentCinema = new StudentCinema(100.0);
        Double adminFeeStudent = studentCinema.calculateAdminFee();
        System.out.println(adminFeeStudent);
    }
}

import java.sql.Date;

class Smartphone extends Product { 
 
    @Override 
    String getName() {
        return "Samsung S10+ Limited Edition"; 
    } 
 
    @Override 
    Date getExpiredDate() { 
        return new Date(0); 
    } 
} 

class Car implements VehicleInterface { 
 
    // Can be implemented 
    @Override 
    public void drive() { 
    
    } 
    
    @Override 
    public void stop() { 
    
    } 
    
    @Override 
    public void refuel() { 
    
    } 

    //this method can't be implemented karena motor tidak punya pintu
    @Override 
    public void openDoors() { 
    
    } 
} 
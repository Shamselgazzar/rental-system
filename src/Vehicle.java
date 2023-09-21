abstract public class Vehicle {
    final private String registrationNumber;
    final private String brand;
    final private int year;
    private boolean isRented;

    public Vehicle(String registrationNumber, String brand, int year){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
        this.isRented = false;
    }

    // getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }

    // renting...
    public boolean isRented() {
        return isRented;
    }
    public void rentVehicle(){
        this.isRented = true;
    }
    public void returnVehicle(){
        this.isRented = false;
    }

    abstract public int calculateRentalCost (int rentalPeriod);
}

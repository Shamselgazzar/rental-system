public class Car extends Vehicle{
    private final String fuelType;

    public Car(String registrationNumber, String brand, int year, String fuelType) {
        super(registrationNumber, brand, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }


    @Override
    public int calculateRentalCost(int rentalPeriod) {
        int price = 100;
        return price * rentalPeriod;
    }

}

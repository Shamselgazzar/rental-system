public class Motorcycle extends Vehicle{
    private final int engineCapacity;
    public Motorcycle(String registrationNumber, String brand, int year, int engineCapacity) {
        super(registrationNumber, brand, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int calculateRentalCost(int rentalPeriod) {
        int price = 50;
        return price * rentalPeriod;
    }
}

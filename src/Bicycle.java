public class Bicycle extends Vehicle{
    public Bicycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public int calculateRentalCost(int rentalPeriod) {
        int price = 20;
        return price * rentalPeriod;
    }

}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n\n");

        // creating new vehicles one of each type...
        Vehicle ford = new Car("1-dfe77v", "Ford", 2002,"oil");
        Vehicle xBike = new Motorcycle("2d00fqw12", "x-bikes", 2010,500);
        Vehicle bicycle = new Bicycle("34m128cf", "airLight", 2018);

        // creating the rental system and simulating the renting process...
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addVehicle(ford);
        rentalSystem.addVehicle(xBike);
        rentalSystem.addVehicle(bicycle);
        rentalSystem.addVehicleEnhanced(bicycle);

        rentalSystem.getTotalRevenue();

        rentalSystem.rentVehicle("1-dfe77v", 5);
        rentalSystem.getTotalRevenue();
        rentalSystem.rentVehicle("1-dfe77v", 1);
        rentalSystem.getTotalRevenue();

        rentalSystem.rentVehicle("2d00fqw12", 2);
        rentalSystem.getTotalRevenue();
        rentalSystem.returnVehicle("1-dfe77v");
        rentalSystem.getTotalRevenue();

        rentalSystem.rentVehicle("34m128cf", 7);
        rentalSystem.getTotalRevenue();

        rentalSystem.returnVehicle("2d00fqw12");
        rentalSystem.getTotalRevenue();
        rentalSystem.returnVehicle("2d00fqw12");
        rentalSystem.getTotalRevenue();

        rentalSystem.rentVehicle("1-dfe77v", 1);
        rentalSystem.getTotalRevenue();
        rentalSystem.rentVehicle("2d00fqw12", 2);
        rentalSystem.getTotalRevenue();



    }
}
//RentalSystem class that manages the rental process.
// It should have methods to add vehicles,
// rent a vehicle,
// return a vehicle,
// and get the total rental revenue.

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class RentalSystem {
    private final List<Vehicle> available = new ArrayList<>();
    private final List<Vehicle> rented = new ArrayList<>();
    private final List<Vehicle> allVehicles = new ArrayList<>();
    private int totalRevenue = 0;


    public void addVehicleEnhanced(Vehicle vehicle){
        for (Vehicle registerdVehicle:allVehicles){
            if(vehicle.getRegistrationNumber().equals(registerdVehicle.getRegistrationNumber())){
                System.out.println("This registration number: "+registerdVehicle.getRegistrationNumber()+", is already in the system.");
                return;
            }

        }
        addVehicle(vehicle);
    }
    public void addVehicle(Vehicle vehicle){
        available.add(vehicle);
        allVehicles.add(vehicle);
    }

    public void rentVehicle(String registrationNumber, int rentalPeriod){
        for (Vehicle vehicle:available){
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                if(!vehicle.isRented()){
                    vehicle.rentVehicle();
                    rented.add(vehicle);
                    available.remove(vehicle);
                    totalRevenue += vehicle.calculateRentalCost(rentalPeriod);
                    System.out.println("The vehicle with registration number: "+registrationNumber+", is now rented.");
                    checkType(vehicle);
                }else {
                    System.out.println("This vehicle is already rented...");
                }
            }else {
                System.out.println("This vehicle is already rented...");
                //System.out.println("There is no vehicle with the registration number: "+ registrationNumber);
            }
            return;
        }
    }

    public void returnVehicle(String registrationNumber){
        for (Vehicle vehicle:rented){
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                if(vehicle.isRented()){
                    vehicle.returnVehicle();
                    available.add(vehicle);
                    rented.remove(vehicle);
                    System.out.println("The vehicle with registration number: "+registrationNumber+", is available again.");
                }else {
                    System.out.println("This vehicle is already not rented...");
                }

            }else{
                System.out.println("This vehicle is already not rented...");
                //System.out.println("There is no vehicle with the registration number: "+ registrationNumber);
            }
            return;
        }
    }

    public void getTotalRevenue(){
        System.out.println("this is the total rental revenue = " + totalRevenue + "$");
    }

    private void checkType(Vehicle vehicle){
        String message = "This is a bike";
        if (vehicle instanceof Car){
             message = "car fuel type: " + ((Car) vehicle).getFuelType();
        } else if (vehicle instanceof Motorcycle) {
            message = "motorbike engine capacity: " + ((Motorcycle) vehicle).getEngineCapacity();
        }
        System.out.println( message);
    }

}

package factoryDesignPattern.VehicalRentalSystem;

public abstract class VehicleRental {
	public abstract Vehicle createVehicle(String type);
	
	public void rentVehicle(String type, int duration) {
		Vehicle vehicle = createVehicle(type);
		if (vehicle == null) {
			System.out.println("Invalid vehicle type: " + type);
			return;
		}
		
		System.out.println("Total rent cost for " + type + "(Duration: " + duration + " hours $" + vehicle.rent(duration) + ")");
		
	}
	
}

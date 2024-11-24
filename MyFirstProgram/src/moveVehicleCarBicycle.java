
public class moveVehicleCarBicycle implements smallCar, smallBicycle { //interface
	@Override
	public void moveCar() {
		System.out.println("The small car is parking next to a vehicle");
	}
	
	@Override
	public void moveBicycle() {
		System.out.println("The small bicycle is parking next to a vehicle");
	}
	
	
}


public class Bicycle extends Vehicle implements smallBicycle{ //inheritance from vehicle
	int pedal;
	Bicycle(int by, String temp, double speed){ //the subclass must call the constructor of the superclass using super().
		super(speed, temp);  //explicitly call the appropriate constructor(vehicle) using super
		this.pedal = by;	
	}
	public String toString() { //print attribute just by calling the class in main
		return this.pedal + "\n" + super.speed + "\n"+ super.temp;
	}
	@Override
	 void move() {
		System.out.println("The bicycle is moving"); 
	}
	@Override
	public void moveBicycle() {
		// TODO Auto-generated method stub
		System.out.println("The small bicycle is moving"); 
	}
	
}
 
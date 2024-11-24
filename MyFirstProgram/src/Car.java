
public class Car extends Vehicle implements smallCar {
	private int door;
	
	Car(int door, String temp, double speed){
		super(speed, temp);
		this.door = door;
	}
	//copy objects
	Car(Car x) {
		super(x.speed, x.temp);
		this.door = x.door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return this.door;
	}
	public String toString() {
		return this.door + "\n" + super.speed + "\n"+ super.temp;
	}
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("The small is moving");
	}
	
	@Override
	public void moveCar() {
		System.out.println("The small car is moving");
	}
	
}

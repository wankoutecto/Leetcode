
public abstract class Vehicle { //abstract to prevent the instantiation(creation) of the class vehicle in main
	 double speed;
	 String temp;
	
	Vehicle(double speed, String temp){
		this.speed = speed;
		this.temp = temp;
	}
	
	Vehicle() {		
	}
		
	abstract void move();
	
	//everything that is protected can only be visible to a different package or a different class
	//that is a subclass of the class containing that protected modifier
	protected String protect = "This message is protected";
	
	//everything that is private is only visible to a class that it contains and nothing else
	//even if it is within the same package
	
	private String privateMessage = "This message is private";
	
	
}

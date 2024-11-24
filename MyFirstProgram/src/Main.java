import javax.swing.JOptionPane;
//import java.util.Scanner; //user input
//import java.util.Random; //random variable
import java.util.*;
import garage.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car(4, "45", 60);
		Car carcopy = new Car(car); //copy object
		Bicycle bicycle = new Bicycle(2, "20", 15);
		//Vehicle vehicle = new Vehicle(); abstract prevents me from creating this instance
		moveVehicleCarBicycle cb = new moveVehicleCarBicycle();
		
		car.move();
		bicycle.move();
		
		System.out.println(car);
		System.out.println(carcopy.getDoor());
		
		Parking1 park = new Parking1();
		System.out.println(park.name);
		
		car.moveCar();
		bicycle.moveBicycle();
		cb.moveCar();
		cb.moveBicycle();
		
		File file = new File("javaTestDocument.txt");
		if(file.exists()) {
			System.out.println("The file exists");
			file.delete();
		}
		else {
			System.out.println("The file doesn't exist");
		}
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("i just create a new file\n");
			writer.write("testing the file\n");
			writer.write("the file is working\n");
			writer.write("close the file after reading\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("poem.txt");
			int data;
			while((data =  reader.read()) != -1) {
				System.out.print((char)data);
			}
			reader.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


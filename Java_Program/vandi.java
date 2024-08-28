package emc_java_tutorial;

class Vehicle{
	String brand;
	int year;
	void startEngine() {
		
	}
}
class Car extends Vehicle{
	String fuelType;
	void startEngine() {
		System.out.println("Car Engine Starts...");
	}
	void drive() {
		System.out.println("Car is driving");
	}
}
class Truck extends Vehicle{
	int loadCapacity;
	void startEngine() {
		System.out.println("Truck Engine Starts");
	}
	void haul(){
		System.out.println("Truck is Hauling");
		
	}
}


public class vandi {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Toy   ota";
		c1.year=2023;
		c1.fuelType="Diesel";
		c1.startEngine();
		c1.drive();
		Truck t1=new Truck();
		t1.brand="Tata";
		t1.year=2018;
		t1.loadCapacity=4;
		t1.startEngine();
		t1.haul();

	}

}

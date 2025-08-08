package newjava;
class Vehicle{
	String brand;
	String model;
	
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("fuelType:"+fuelType);
	}
	
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
		public void displayInfo() {
			super.displayInfo();
			System.out.println("batteryCapacity:"+batteryCapacity);
		}
}
public class demo2 {
	public static void main(String[] args) {
		ElectricCar ecar=new ElectricCar("abc","def","diesel",200.12);
		ecar.displayInfo();
	}
}

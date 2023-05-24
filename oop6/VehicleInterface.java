package oop6;

interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
class Bicycle implements Vehicle {
    private int gear;
    private int speed;
    
    // Bicycle-specific implementation of interface methods
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Changed gear to " + gear);
    }
    
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speeding up by " + increment + " km/h");
    }
    
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Applying brakes. Speed decreased by " + decrement + " km/h");
    }
}
class Bike implements Vehicle {
    private int gear;
    private int speed;
    
    // Bike-specific implementation of interface methods
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Changed gear to " + gear);
    }
    
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speeding up by " + increment + " km/h");
    }
    
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Applying brakes. Speed decreased by " + decrement + " km/h");
    }
}

class Car implements Vehicle {
    private int gear;
    private int speed;
    
    // Car-specific implementation of interface methods
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Changed gear to " + gear);
    }
    
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speeding up by " + increment + " km/h");
    }
    
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Applying brakes. Speed decreased by " + decrement + " km/h");
    }
}
public class VehicleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        System.out.println("BICYCLE:");
        bicycle.changeGear(3);
        bicycle.speedUp(10);
        bicycle.applyBrakes(5);
        System.out.println("BIKE:");
        bike.changeGear(4);
        bike.speedUp(20);
        bike.applyBrakes(10);
        System.out.println("CAR:");
        car.changeGear(2);
        car.speedUp(50);
        car.applyBrakes(20);
	}

}

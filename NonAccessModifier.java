abstract class Vehicle{
    private String vehicleNumber; // 

    final void showVehicleNumber(){
        System.out.println("This Vehical Number is: " +getVehicleNumber());
    }
    abstract void fuelType();
    abstract void maxSpeed();

    public String getVehicleNumber(){
            return vehicleNumber;
    }

    public void setVehicleNumber( String vehicalNumber){
        this.vehicleNumber = vehicalNumber;
    }

} 

class Car extends Vehicle{
    @Override
    public void fuelType(){
        System.out.println("A Car uses petrol and disel");
    }

    @Override
    public void maxSpeed(){
        System.out.println("A Car max speed is 120km/h");
    }
}

class Bike extends Vehicle{
    @Override
    public void fuelType(){
        System.out.println("A Bike uses Petrol ");
    }

    @Override
    public void maxSpeed(){
        System.out.println("A Bike max speed is 90km/h");
    }
}

class Bus extends Vehicle{
    @Override
    public void fuelType(){
        System.out.println("A Bus uses disel ");
    }

    @Override
    public void maxSpeed(){
        System.out.println("A Bus max speed is 110");
    }
}

public class NonAccessModifier {

    public static void main (String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.setVehicleNumber("MH 12 TY 4667");
        car.showVehicleNumber();
        car.fuelType();
        car.maxSpeed();

        bike.setVehicleNumber("MH 12 FG 9854");
        bike.showVehicleNumber();
        bike.fuelType();
        bike.maxSpeed();

        bus.setVehicleNumber("MH 12 OD 2342");
        bus.showVehicleNumber();
        bus.fuelType();
        bus.maxSpeed();

    }
    
}

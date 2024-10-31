package designpatterns.nullpattern;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle){

        if("Bike".equals(typeOfVehicle)) {

            return new Bike();
        }

        return new NullVehicle();
    }
}

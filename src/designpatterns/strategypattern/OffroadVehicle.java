package designpatterns.strategypattern;

public class OffroadVehicle extends Vehicle {
    OffroadVehicle(){
        super(new NormalDrive());
    }
}

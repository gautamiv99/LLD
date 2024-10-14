package designpatterns.strategypattern;

public class MotoVehicle extends Vehicle{
    MotoVehicle(){
        super(new SpecialDrive());
    }
}

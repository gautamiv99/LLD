package designpatterns.strategypattern;

public class NormalDrive implements DriveStrategy {

    public void drive(){
        System.out.println("Normal drive!");
    }
}

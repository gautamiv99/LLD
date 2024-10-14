package designpatterns.strategypattern;

public class SpecialDrive implements DriveStrategy {
    public void drive(){
        System.out.println("Special drive!");
    }
}

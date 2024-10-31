package designpatterns.nullpattern;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}

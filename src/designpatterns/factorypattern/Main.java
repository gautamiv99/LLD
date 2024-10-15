package designpatterns.factorypattern;

public class Main {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("circle");
        shape.draw();
    }
}

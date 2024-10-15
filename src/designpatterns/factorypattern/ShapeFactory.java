package designpatterns.factorypattern;

public class ShapeFactory {

    Shape getShape(String shapeDescription){
        switch (shapeDescription){
            case "circle": return new Circle();
            case "square": return new Square();
            case "triangle": return new Triangle();
            default: return null;
        }
    }

}

package designpatterns.decoratorpattern;

public class Main {
    public static void main(String[] args){
        BasePizza pizza = new Cheese(new Mushroom(new Margaritta()));
        System.out.println("Cost is " + pizza.cost());
    }
}

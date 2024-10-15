package designpatterns.decoratorpattern;

public class Cheese extends ToppingsDecorator {

    BasePizza pizza;

    Cheese(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    int cost() {
        return pizza.cost() + 10;
    }
}

package designpatterns.decoratorpattern;

public class Mushroom extends ToppingsDecorator {

    BasePizza pizza;

    Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    int cost(){
        return pizza.cost() + 10;
    }
}

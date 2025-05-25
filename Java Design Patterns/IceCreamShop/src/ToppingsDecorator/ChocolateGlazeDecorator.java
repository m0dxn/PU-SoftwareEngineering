package src.ToppingsDecorator;

import src.IceCreams.IceCream;

public class ChocolateGlazeDecorator extends IceCreamDecorator {

    public ChocolateGlazeDecorator(IceCream iceCream) {
        super(iceCream);
    }
    public String getDescription() {
        return super.getDescription() + " + Chocolate Glaze";
    }

    public double getCost() {
        return IceCream.getCost() + 0.50;
    }
}

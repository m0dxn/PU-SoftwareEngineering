package src.ToppingsDecorator;

import src.IceCreams.IceCream;

public class ChocolateSprinklesDecorator extends IceCreamDecorator {
    public ChocolateSprinklesDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return IceCream.getDescription() + " + Chocolate Sprinkles";
    }

    public double getCost() {
        return IceCream.getCost() + 0.25;
    }
}

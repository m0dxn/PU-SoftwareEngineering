package src.ToppingsDecorator;

import src.IceCreams.IceCream;

public abstract class IceCreamDecorator implements IceCream {

    protected IceCream IceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.IceCream = iceCream;
    }

    public String getDescription() {
        return IceCream.getDescription();
    }


    public double getCost() {
        return IceCream.getCost();
    }
}

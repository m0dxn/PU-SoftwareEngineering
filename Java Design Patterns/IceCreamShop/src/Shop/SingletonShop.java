package src.Shop;

import src.IceCreamFactory.IceCreamFactory;
import src.IceCreams.IceCream;
import src.ToppingsDecorator.ChocolateGlazeDecorator;
import src.ToppingsDecorator.ChocolateSprinklesDecorator;

public class SingletonShop {
    private static SingletonShop instance;
    private SingletonShop() {
    }
    public static SingletonShop getInstance() {
        if (instance == null) {
            instance = new SingletonShop();
        }
        return instance;
    }
    public IceCream makeIceCream(String type, String topping) {
        IceCream iceCream = IceCreamFactory.createIceCream(type);

        if(iceCream==null){
            return null;
        }

        if(topping.equalsIgnoreCase("glaze")){
            iceCream=new ChocolateGlazeDecorator(iceCream);
        }
        else if(topping.equalsIgnoreCase("sprinkles")){
            iceCream=new ChocolateSprinklesDecorator(iceCream);
        }

        return iceCream;
    }
}

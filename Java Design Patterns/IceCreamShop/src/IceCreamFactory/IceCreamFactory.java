package src.IceCreamFactory;

import src.IceCreams.ChocolateIceCream;
import src.IceCreams.IceCream;
import src.IceCreams.StrawberryIceCream;
import src.IceCreams.VanillaIceCream;

public class IceCreamFactory {
    public static IceCream createIceCream(String type) {
        if (type.equalsIgnoreCase("vanilla")) {
            return new VanillaIceCream();
        }
        else if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateIceCream();
        }
        else if(type.equalsIgnoreCase("strawberry")){
            return new StrawberryIceCream();
        }
        else {
            return null;
        }
    }
}

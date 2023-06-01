package dz_1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public BarOfChocolate getBarOfChocolate(int mass){
        for (Product product : products){
            if (product instanceof BarOfChocolate){
                if (((BarOfChocolate)product).getMassChocolate()  == mass){
                    return (BarOfChocolate)product;
                }
            }
        }
        return null;
    }


}
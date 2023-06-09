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

    public BarOfChocolate getBarOfChocolateMass(int mass){
        for (Product product : products){
            if (product instanceof BarOfChocolate){
                if (((BarOfChocolate)product).getMassChocolate()  == mass){
                    return (BarOfChocolate)product;
                }
            }
        }
        return null;
    }

    public BarOfChocolate getBarOfChocolateCalorie(double calorieContent){
        for (Product product : products){
            if (product instanceof BarOfChocolate){
                if (((BarOfChocolate)product).getCalorieContent()  == calorieContent){
                    return (BarOfChocolate)product;
                }
            }
        }
        return null;
    }

    public BarOfChocolate getBarOfChocolateName(String name){
        for (Product product : products) {
            if (product instanceof BarOfChocolate) {
                if (product.name.equals("Аленка")) {
                    return (BarOfChocolate) product;
                }
            }
        }
        return null;
    }


}
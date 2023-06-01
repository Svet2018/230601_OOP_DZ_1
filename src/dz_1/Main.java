package dz_1;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Создать новый продукт на основе Product, создать ему хотя бы одно свойство
    (например, шоколад и калории) и включить в список продуктов в вендинг машину.
    Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
     */

    public static void main(String[] args) {
        System.out.println("Товары на продажу:");
        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);

        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Молоко натуральное", "Бутылка с молоком", 115, 1.5, 10);
        Product barOfChocolate1 = new BarOfChocolate("ООО Сладость", "Шоколадка вкусная", 98, 220);
        Product barOfChocolate2 = new BarOfChocolate("ООО Вкус", "Шоколад белый", 128, 120);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(barOfChocolate1);
        products.add(barOfChocolate2);

        for (int i = 0; i < products.size(); i++){
            System.out.println(products.get(i).displayInfo());
        }

        System.out.println();

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
    }
}



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
        Product bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        Product bottleOfMilk1 = new BottleOfMilk("ООО Молоко натуральное", "Бутылка с молоком", 115, 1.5, 10);
        Product barOfChocolate1 = new BarOfChocolate("ООО Сладость", "Шоколадка вкусная", 98, 220, "Черный", 30);
        Product barOfChocolate2 = new BarOfChocolate("ООО Вкус", "Шоколад белый", 128, -120, "Белый", 150);
        Product barOfChocolate3 = new BarOfChocolate("ООО Вкус", "Шоколадка", 132, 320, "Молочный", 90);
        Product barOfChocolate4 = new BarOfChocolate("ООО Сладость", "Солнышко", 332, 202, " ", 240);
        Product barOfChocolate5 = new BarOfChocolate("ООО Шоколад", "Аленка", -1, 402, "чч", 55);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(barOfChocolate1);
        products.add(barOfChocolate2);
        products.add(barOfChocolate3);
        products.add(barOfChocolate4);
        products.add(barOfChocolate5);

        printProducts(products);
        System.out.println("-------------------");

        VendingMachine vendingMachine = new VendingMachine(products);

        BarOfChocolate barOfChocolateResult1 = vendingMachine.getBarOfChocolateMass(100);
        BarOfChocolate.barOfChocolateReturne(barOfChocolateResult1);
        System.out.println();

        BarOfChocolate barOfChocolateResult2 = vendingMachine.getBarOfChocolateMass(90);
        BarOfChocolate.barOfChocolateReturne(barOfChocolateResult2);
        System.out.println();

        BarOfChocolate barOfChocolateResult3 = vendingMachine.getBarOfChocolateCalorie(240);
        BarOfChocolate.barOfChocolateReturne(barOfChocolateResult3);
        System.out.println();

        BarOfChocolate barOfChocolateResult4 = vendingMachine.getBarOfChocolateName("Аленка");
        BarOfChocolate.barOfChocolateReturne(barOfChocolateResult4);
        System.out.println();



    }



    static void printProducts (List<Product> list){
        List <Product> listProduct = list;
        for (int i = 0; i < listProduct.size(); i++){
            System.out.println(listProduct.get(i).displayInfo());
        }
    }
}



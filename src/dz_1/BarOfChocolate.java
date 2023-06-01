package dz_1;

public class BarOfChocolate extends Product{

    private double calorieContent; //Содержание каллорий

    public BarOfChocolate (String brand, String name, double price, double calorieContent) {
        super(brand, name, price);
        this.calorieContent = calorieContent;
    }

    @Override
    public String displayInfo() {
        return String.format("Плитка шоколада: Производитель - %s; Название - %s; Цена - %f; Калории - %f", brand, name, price, calorieContent);
    }





}

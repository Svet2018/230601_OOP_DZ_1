package dz_1;

public class BarOfChocolate extends Product{

    private double calorieContent; //Содержание каллорий
    private String colorChocolate; //Цвет шоколада
    private int massChocolate;



    public BarOfChocolate (String brand, String name, double price, double calorieContent, String colorChocolate, int massChocolate) {
        super(brand, name, price);
        checkCalories(calorieContent);
        checkColor(colorChocolate);
        checkMass(massChocolate);
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(double calorieContent) {
        checkCalories(calorieContent);
    }

    public String getColorChocolate() {
        return colorChocolate;
    }

    public void setColorChocolate(String colorChocolate) {
        checkColor(colorChocolate);
    }

    public int getMassChocolate() {
        return massChocolate;
    }

    public void setMassChocolate(int massChocolate) {
        checkMass(massChocolate);
    }

    protected void checkMass (int massChocolate){
        if (massChocolate < 50){
            this.massChocolate = 50;
        }
        else this.massChocolate = massChocolate;
    }

    protected void checkCalories (double calorieContent){
        if (calorieContent < 0){
            this.calorieContent = 200;
        }
        else this.calorieContent = calorieContent;
    }
    protected void checkColor (String colorChocolate){
        if (colorChocolate.equals("Белый") || colorChocolate.equals("Черный") || colorChocolate.equals("Молочный")){
            this.colorChocolate = colorChocolate;
        }
        else if (colorChocolate.isEmpty() || colorChocolate.isBlank()) {
            this.colorChocolate = "Черный";
        }
        else this.colorChocolate = "Черный";
    }

    @Override
    public String displayInfo() {
        return String.format("Плитка шоколада: Производитель - %s; Название - %s; Цена - %f; Калории - %f; Цвет шоколадки - %s; Масса шоколадки (гр) - %d", brand, name, price, calorieContent, colorChocolate, massChocolate);
    }





}

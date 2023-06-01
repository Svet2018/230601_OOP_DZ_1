package dz_1;

public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка воды: Производитель - %s; Название - %s; Цена - %f; Объем (л) - %f", brand, name, price, volume);
    }
}

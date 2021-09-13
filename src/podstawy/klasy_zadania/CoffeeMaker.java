package podstawy.klasy_zadania;

public class CoffeeMaker {
    private final String manufacturer;
    private final int grindSize;

    public CoffeeMaker(String manufacturer, int grindSize) {
        this.manufacturer = manufacturer;
        this.grindSize = grindSize;
    }

    public void makeCoffee() {
        System.out.println("Ekspres firmy " + manufacturer + " mieli ziarna na grubość " + grindSize + " i parzy kawę.");
    }
}

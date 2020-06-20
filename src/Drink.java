import org.w3c.dom.ls.LSOutput;

public class Drink {
    private String drink;
    private double price;
    private boolean containsAlcohol;

    Drink(String drink, double price, boolean containsAlcohol) {
        this.drink = drink;
        this.price = price;
        this.containsAlcohol = containsAlcohol;
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

}

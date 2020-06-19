import org.w3c.dom.ls.LSOutput;

public class Drink {
    private String drink;
    private Double price;
    private boolean containsAlcohol;

    Drink() {

    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

    public void setContainsAlcohol(boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }
}

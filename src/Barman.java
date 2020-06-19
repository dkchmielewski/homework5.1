public class Barman {

    void order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isContainsAlcohol()) {
            System.out.println("Transaction declined");
        } else {
            System.out.println(person.getFirstName() + ", Twoj drink jest gotowy do obioru. Kwota do zaplaty "
            + drink.getPrice() + " zl");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Ana", "Kowalski", 17);
        Drink drink1 = new Drink("Mojito", 8.00, true);

        Barman order1 = new Barman();
        order1.order(person1, drink1);

    }
}

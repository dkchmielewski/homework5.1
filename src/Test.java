public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Ana");
        person1.setAge(17);
        Drink drink1 = new Drink();
        drink1.setContainsAlcohol(true);
        drink1.setPrice(8.00);

        Barman order1 = new Barman();
        order1.order(person1, drink1);

    }
}

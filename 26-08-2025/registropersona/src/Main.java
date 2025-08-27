import models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Silvio", 27);
        System.out.println(person.showInfo());
    }
}

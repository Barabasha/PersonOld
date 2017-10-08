import java.util.ArrayList;

/*
1. Создать класс человек - имя , дата рождения, пол (enum);
2. Инициализировать список объектов класс человек;
3. Найти всех людей призывного возраста;
4. Найти средний возраст женщин;
5. Найти всех людей кто 1990 г. рождения.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> listOfPerson = new ArrayList<Person>();
        Person person1 = new Person("Ivanov", 1990, Gender.Male);
        Person person2 = new Person("Petrov", 1992, Gender.Male);
        Person person3 = new Person("Sidorov", 2001, Gender.Male);
        Person person4 = new Person("Pupkina", 1990, Gender.Female);
        Person person5 = new Person("Moloduhina", 2002, Gender.Female);
        Person person6 = new Person("Staruhina", 1940, Gender.Female);
        listOfPerson.add(person1);
        listOfPerson.add(person2);
        listOfPerson.add(person3);
        listOfPerson.add(person4);
        listOfPerson.add(person5);
        listOfPerson.add(person6);
        Container list = new Container(listOfPerson);

        System.out.println("Lis of recruit: " + list.recruit());
        System.out.println("Average age of women: " + list.womenAverage());
        System.out.println("People born in 1990: " + list.listOfYear(1990));
    }
}

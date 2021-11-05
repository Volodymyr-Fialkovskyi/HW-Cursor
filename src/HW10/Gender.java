package HW10;

import java.util.Set;
import java.util.stream.Collectors;

public enum Gender {
    MALE, FEMALE
}

class Main {

    public static void main(String[] args) {

        Set<Person> adultPersons = personsDatabase();

        adultPersons
                .stream()
                .filter(x -> x.getAge() >= 18)
                .filter(x -> x.getAge() < 60)
                .map(person -> person.getName() + " - " + person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static Set<Person> personsDatabase() {
        return Set.of(
                new Person("Petro", 10, Gender.MALE),
                new Person("Anna", 18, Gender.FEMALE),
                new Person("Ivan", 79, Gender.MALE),
                new Person("Viktoria", 17, Gender.FEMALE),
                new Person("Volodymyr", 21, Gender.MALE),
                new Person("Oksana", 45, Gender.FEMALE),
                new Person("Andriy", 47, Gender.MALE),
                new Person("Maria", 68, Gender.FEMALE)
        );
    }
}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person: " +
                "name " + name + ' ' +
                ", age " + age +
                ", gender " + gender +
                ' ';
    }
}
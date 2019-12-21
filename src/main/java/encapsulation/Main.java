package encapsulation;

import encapsulation.model.Person;

public class Main {

    public static void main(String[] args) {

        /*
            Each object can store different data.
         */
        Person person1 = new Person("Alex", 15);
        Person person2 = new Person("Juliet", 12);
        Person person3 = new Person("Vader", 16);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        System.out.println(person3.getName());
        System.out.println(person3.getAge());
    }

}

package Services;

import domain.Person;
/**
 * Created by Cant-Detect on 2016/03/13.
 */
public class PersonImpl implements PersonOcupation {

    public Person getPersonDescription() {
        Person person = new Person();
        person.setName("Aphiwe");
        person.setSurname("Blom");
        person.setAge(23);

        return person;
    }
}

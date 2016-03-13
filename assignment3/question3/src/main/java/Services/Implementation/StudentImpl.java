package Services.Implementation;

import Services.PersonOcupation;
import domain.Person;

/**
 * Created by Cant-Detect on 2016/03/13.
 */
public class StudentImpl implements PersonOcupation {
    public Person getPersonDescription() {
        Person student = new Person();
        student.setName("Songezo");
        student.setSurname("Mkumatela");
        student.setAge(24);

        return student;
    }
}

package Services.Implementation;

import Services.PersonOcupation;
import domain.Person;

/**
 * Created by Cant-Detect on 2016/03/13.
 */
public class LectureImpl implements PersonOcupation{
    public Person getPersonDescription() {
        Person lecture = new Person();
        lecture.setName("Avela");
        lecture.setSurname("Kobobo");
        lecture.setAge(23);

        return lecture;
    }
}

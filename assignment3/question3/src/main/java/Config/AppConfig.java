package Config;

import Services.Implementation.LectureImpl;
import Services.Implementation.LectureImpl;
import Services.Implementation.StudentImpl;
import Services.PersonOcupation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
    @Bean(name="Song")
    public PersonOcupation getPersonDescription(){
        return new StudentImpl();
    }

    @Bean(name="Ave")
    public PersonOcupation getPersonDescription(){
        return new LectureImpl();
    }
}

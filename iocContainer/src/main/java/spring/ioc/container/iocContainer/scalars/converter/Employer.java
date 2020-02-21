package spring.ioc.container.iocContainer.scalars.converter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employer {

    public Person getPerson() {
        return person;
    }

    private Person person;

    public Employer(@Value("Bruno") Person person){
        this.person = person;
    }

}

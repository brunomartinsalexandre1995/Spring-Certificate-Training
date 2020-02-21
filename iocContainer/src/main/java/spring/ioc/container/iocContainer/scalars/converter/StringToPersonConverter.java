package spring.ioc.container.iocContainer.scalars.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToPersonConverter implements Converter<String, Person> {

    @Override
    public Person convert(String s) {
        return new Person(s);
    }
}

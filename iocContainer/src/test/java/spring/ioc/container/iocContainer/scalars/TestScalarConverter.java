package spring.ioc.container.iocContainer.scalars;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.scalars.converter.Employer;
import spring.ioc.container.iocContainer.scalars.converter.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestScalarConverter {

    @Autowired
    private Employer employer;

    @Test
    public void testEmployer() {
        Assertions.assertEquals(employer.getPerson().getName(), "Bruno");
    }


}

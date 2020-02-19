package spring.ioc.container.iocContainer.beanIOnjection.field;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.beanInjection.field.BeanWithFields;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldInjectionTest {

    @Autowired
    private BeanWithFields beanWithFields;

    @Test
    public void numberOfBeanCreations() {

        Assertions.assertNotNull(beanWithFields.getBeanSet1());
        Assertions.assertNotNull(beanWithFields.getBeanSet2());

    }

}

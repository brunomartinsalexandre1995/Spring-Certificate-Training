package spring.ioc.container.iocContainer.beanIOnjection.setter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.beanInjection.constructor.*;
import spring.ioc.container.iocContainer.beanInjection.setter.BeanWithSetters;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SetterInjectionTest {

    @Autowired
    private BeanWithSetters beanWithSetters;





    @Test
    public void numberOfBeanCreations() {

        Assertions.assertNotNull(beanWithSetters.getBeanSet1());
        Assertions.assertNotNull(beanWithSetters.getBeanSet2());

    }



}

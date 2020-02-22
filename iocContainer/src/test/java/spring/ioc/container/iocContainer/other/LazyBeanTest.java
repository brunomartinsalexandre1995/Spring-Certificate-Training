package spring.ioc.container.iocContainer.other;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.others.ComponentWithLazyBean;
import spring.ioc.container.iocContainer.others.LazyBean;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LazyBeanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ComponentWithLazyBean componentWithLazyBean;

    @Test
    public void verifyThatLazyBeanDoesNotExist() {
        Date dateNow = new Date();
        LazyBean x = componentWithLazyBean.lazyBean;
        Date dateTHatTheBEanWasCreated = x.getCreateDate();
        Assertions.assertTrue(dateTHatTheBEanWasCreated.compareTo(dateNow) > 0);
    }

}

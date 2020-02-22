package spring.ioc.container.iocContainer.other;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.others.ComponentWithBeansThatNotExist;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutowiredRequiredAtrribueTest {

    @Autowired
    ComponentWithBeansThatNotExist componentWithBeansThatNotExist;

    @Test
    public void thisShouldNotFail(){
        Assertions.assertNull(componentWithBeansThatNotExist.getSomeBean());
    }


}

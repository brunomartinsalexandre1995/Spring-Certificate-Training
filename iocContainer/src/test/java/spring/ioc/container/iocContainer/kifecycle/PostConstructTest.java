package spring.ioc.container.iocContainer.kifecycle;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.lifecycle.init.BeanWithInitInterface;
import spring.ioc.container.iocContainer.lifecycle.init.BeanWithInitMethod;
import spring.ioc.container.iocContainer.lifecycle.init.LifeCycleBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostConstructTest {

    @Autowired
    private BeanWithInitMethod beanWithInitMethod;

    @Autowired
    private BeanWithInitInterface beanWithInitInterface;


    @Autowired
    private LifeCycleBean lifeCycleBean;


    @Test
    public void testPostConstruct() {
        Assertions.assertEquals(10, beanWithInitMethod.getX());

    }

    @Test
    public void tesInitInterface() {
        Assertions.assertEquals(10, beanWithInitInterface.getX());

    }


    @Test
    public void testBeanInitMethodInConfiguration() {
        Assertions.assertEquals(10, lifeCycleBean.getX());

    }

}

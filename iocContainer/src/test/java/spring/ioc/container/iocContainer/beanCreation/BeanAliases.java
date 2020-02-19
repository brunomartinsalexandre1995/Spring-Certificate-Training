package spring.ioc.container.iocContainer.beanCreation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanAliases {

    @Autowired
    private ApplicationContext context;

    @Test
    public void beanAliasesTest() {
        BeanWillAliases simpleBean1 = (BeanWillAliases) context.getBean("alias1");
        BeanWillAliases simpleBean2 = (BeanWillAliases) context.getBean("alias2");


        Assertions.assertNotNull(simpleBean1);
        Assertions.assertNotNull(simpleBean2);

        Assertions.assertEquals(simpleBean1, simpleBean2);

    }

    @Test
    public void beanDefaultNameTest() {
        BeanService simpleBean1 = (BeanService) context.getBean("beanService");
        Assertions.assertNotNull(simpleBean1);

    }

    @Test
    public void beanInsertedNameTest() {
        BeanServiceWithName simpleBean1 = (BeanServiceWithName) context.getBean("SomeName");
        Assertions.assertNotNull(simpleBean1);

    }
}

package spring.ioc.container.iocContainer.beanCreation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.beans.BeanThatWillHaveAliases;
import spring.ioc.container.iocContainer.beans.SimpleBean;
import spring.ioc.container.iocContainer.beans.SimpleStereotypeClass;
import spring.ioc.container.iocContainer.beans.SimpleStereotypeClassWithName;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanAliases {

    @Autowired
    private ApplicationContext context;

    @Test
    public void beanAliasesTest() {
        BeanThatWillHaveAliases simpleBean1 = (BeanThatWillHaveAliases) context.getBean("alias1");
        BeanThatWillHaveAliases simpleBean2 = (BeanThatWillHaveAliases) context.getBean("alias2");


        Assertions.assertNotNull(simpleBean1);
        Assertions.assertNotNull(simpleBean2);

        Assertions.assertEquals(simpleBean1, simpleBean2);

    }

    @Test
    public void beanDefaultNameTest() {
        SimpleStereotypeClass simpleBean1 = (SimpleStereotypeClass) context.getBean("simpleStereotypeClass");
        Assertions.assertNotNull(simpleBean1);

    }

    @Test
    public void beanInsertedNameTest() {
        SimpleStereotypeClassWithName simpleBean1 = (SimpleStereotypeClassWithName) context.getBean("SomeName");
        Assertions.assertNotNull(simpleBean1);

    }
}

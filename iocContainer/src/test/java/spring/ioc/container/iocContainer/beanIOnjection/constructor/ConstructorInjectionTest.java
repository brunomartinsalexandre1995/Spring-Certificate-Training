package spring.ioc.container.iocContainer.beanIOnjection.constructor;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.beanInjection.constructor.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectionTest {

    @Autowired
    private SomeClassA someClassA;

    @Autowired
    private SomeInterface beanA;

    @Autowired
    private SomeInterface beanB;

    @Autowired
    private ClassWithScalarConstructor classWithScalarConstructor;


    @Qualifier("beanB")
    @Autowired
    private SomeInterface someInterfaceBean;



    @Test
    public void numberOfBeanCreations() {

        Assertions.assertNotNull(someClassA.getBeanA());
        Assertions.assertTrue(someClassA.getBeanA() instanceof BeanA);

    }

    @Test
    public void injectionByName() {

        Assertions.assertNotNull(beanA);
        Assertions.assertTrue(beanA instanceof BeanA);

        Assertions.assertNotNull(beanB);
        Assertions.assertTrue(beanB instanceof BeanB);

        Assertions.assertNotNull(someInterfaceBean);
        Assertions.assertTrue(someInterfaceBean instanceof BeanB);
    }


    @Test
    public void constructorWithScalarValues() {


        Assertions.assertEquals(500, classWithScalarConstructor.getVal1());
        Assertions.assertEquals("StringV", classWithScalarConstructor.getVal2());
    }

}

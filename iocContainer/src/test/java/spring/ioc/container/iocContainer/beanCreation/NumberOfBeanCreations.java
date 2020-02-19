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
public class NumberOfBeanCreations {

    @Autowired
    private ApplicationContext context;

    @Test
    public void numberOfBeanCreations(){
        BeanCreationConfiguration basicConfig = context.getBean(BeanCreationConfiguration.class);


        Assertions.assertEquals(basicConfig.getNumberOfBeanWithDependencyBeansCreated(),1);
        Assertions.assertEquals(basicConfig.getNumberOfSimpleBeansCreated(),1);

    }

    @Test
    public void simpleBeanCreationTest(){
        BeanBasic simpleBean = (BeanBasic) context.getBean("createSimpleBean");


        Assertions.assertEquals(simpleBean.getX(),10);
        Assertions.assertEquals(simpleBean.getY(),10);

    }


}

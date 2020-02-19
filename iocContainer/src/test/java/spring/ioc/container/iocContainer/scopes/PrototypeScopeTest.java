package spring.ioc.container.iocContainer.scopes;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.scopes.prototype.ClassWithPrototypeBeans;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypeScopeTest {

    @Autowired
    private ClassWithPrototypeBeans classWithPrototypeBeans;

    @Test
    public void testPrototypeScope(){
        Assertions.assertNotEquals(classWithPrototypeBeans.getPrototypeBean1().getRandomValue(), classWithPrototypeBeans.getPrototypeBean2().getRandomValue());
        Assertions.assertNotEquals(classWithPrototypeBeans.getPrototypeBean1().getRandomValue(), classWithPrototypeBeans.getPrototypeBean3().getRandomValue());
        Assertions.assertNotEquals(classWithPrototypeBeans.getPrototypeBean2().getRandomValue(), classWithPrototypeBeans.getPrototypeBean3().getRandomValue());

    }

}

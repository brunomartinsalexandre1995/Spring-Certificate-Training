package spring.ioc.container.iocContainer.scalars;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.ioc.container.iocContainer.scalars.collections.ClassWithCollection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestScalarCollectionsInjection {

    @Autowired
    ClassWithCollection classWithCollection;

    @Test
    public void testCollectionsInjection(){
        Assertions.assertEquals(classWithCollection.getVarOne().size(), 1);
        Assertions.assertEquals(classWithCollection.getVarOne().get(0), "Bruno");
    }


}

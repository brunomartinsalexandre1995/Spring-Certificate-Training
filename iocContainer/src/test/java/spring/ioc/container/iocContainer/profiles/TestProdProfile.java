package spring.ioc.container.iocContainer.profiles;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("Prod")
public class TestProdProfile {

    @Autowired
    SomeProfileTestBean someProfileTestBean;

    @Test
    public void testProdProfile(){
        Assertions.assertEquals(20, someProfileTestBean.value);
    }


}

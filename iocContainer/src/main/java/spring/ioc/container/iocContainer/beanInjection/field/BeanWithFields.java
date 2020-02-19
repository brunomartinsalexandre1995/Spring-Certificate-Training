package spring.ioc.container.iocContainer.beanInjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithFields {



    public BeanField1 getBeanSet1() {
        return beanSet1;
    }

    public BeanField2 getBeanSet2() {
        return beanSet2;
    }

    @Autowired
    private BeanField1 beanSet1;

    @Autowired
    private BeanField2 beanSet2;



}

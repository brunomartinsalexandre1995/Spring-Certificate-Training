package spring.ioc.container.iocContainer.beanInjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithSetters {

    @Autowired
    public void setBeanSet1(BeanSet1 beanSet1) {
        this.beanSet1 = beanSet1;
    }

    @Autowired
    public void setBeanSet2(BeanSet2 beanSet2) {
        this.beanSet2 = beanSet2;
    }

    public BeanSet1 getBeanSet1() {
        return beanSet1;
    }

    public BeanSet2 getBeanSet2() {
        return beanSet2;
    }

    private BeanSet1 beanSet1;
    private BeanSet2 beanSet2;



}

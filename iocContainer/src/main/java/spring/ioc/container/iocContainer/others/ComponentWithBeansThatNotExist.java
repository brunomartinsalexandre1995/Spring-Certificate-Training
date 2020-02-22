package spring.ioc.container.iocContainer.others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.ioc.container.iocContainer.beanInjection.constructor.BeanA;

@Component
public class ComponentWithBeansThatNotExist {

    public BeanA getSomeBean() {
        return someBean;
    }

    public void setSomeBean(BeanA someBean) {
        this.someBean = someBean;
    }

    @Autowired(required = false)
    @Qualifier("ThisDoesNotExist")
    private BeanA someBean;



}

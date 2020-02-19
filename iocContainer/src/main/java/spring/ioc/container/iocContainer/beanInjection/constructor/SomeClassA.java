package spring.ioc.container.iocContainer.beanInjection.constructor;

import org.springframework.stereotype.Component;

@Component
public class SomeClassA {

    public SomeInterface getBeanA() {
        return beanA;
    }

    private SomeInterface beanA;

    public SomeClassA(BeanA beanA){
        this.beanA = beanA;
    }


}

package spring.ioc.container.iocContainer.scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassWithPrototypeBeans {

    @Autowired
    public void setPrototypeBean1(PrototypeBean prototypeBean1) {
        this.prototypeBean1 = prototypeBean1;
    }

    private PrototypeBean prototypeBean1;


    @Autowired
    public void setPrototypeBean2(PrototypeBean prototypeBean2) {
        this.prototypeBean2 = prototypeBean2;
    }


    @Autowired
    public void setPrototypeBean3(PrototypeBean prototypeBean3) {
        this.prototypeBean3 = prototypeBean3;
    }

    public PrototypeBean getPrototypeBean1() {
        return prototypeBean1;
    }

    public PrototypeBean getPrototypeBean2() {
        return prototypeBean2;
    }

    public PrototypeBean getPrototypeBean3() {
        return prototypeBean3;
    }

    private PrototypeBean prototypeBean2;


    private PrototypeBean prototypeBean3;


}

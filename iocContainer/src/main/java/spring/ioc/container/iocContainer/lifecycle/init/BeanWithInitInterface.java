package spring.ioc.container.iocContainer.lifecycle.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanWithInitInterface implements InitializingBean {


    public int getX() {
        return x;
    }

    private int x = 15;

    public BeanWithInitInterface(){
        this.x /= 3;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        x *= 2;
    }
}

package spring.ioc.container.iocContainer.lifecycle.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanWithInitMethod {

    public int getX() {
        return x;
    }

    private int x = 0;

    public BeanWithInitMethod(@Value("5") int x) {
        this.x = x;
    }

    @PostConstruct
    private void initMethod(){
        this.x *= 2;
    }


}

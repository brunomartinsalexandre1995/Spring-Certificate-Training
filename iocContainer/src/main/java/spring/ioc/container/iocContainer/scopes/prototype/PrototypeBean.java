package spring.ioc.container.iocContainer.scopes.prototype;

import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    public int getRandomValue() {
        return randomValue;
    }

    private int randomValue;

    public PrototypeBean() {
        Random random = new Random();
        this.randomValue = random.nextInt(100);
    }

}

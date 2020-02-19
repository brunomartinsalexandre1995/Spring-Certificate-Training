package spring.ioc.container.iocContainer.beanInjection.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassWithScalarConstructor {

    public int getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    private int val1;
    private String val2;

    public ClassWithScalarConstructor(@Value("500") int val1, @Value("StringV") String val2){
        this.val1 = val1;
        this.val2 = val2;
    }

}

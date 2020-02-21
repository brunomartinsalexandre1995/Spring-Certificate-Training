package spring.ioc.container.iocContainer.scalars.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassWithCollection {

    private List<String> varOne;

    @Autowired
    public void setVarOne(List<String> varOne) {
        this.varOne = varOne;
    }

    public List<String> getVarOne() {
        return varOne;
    }
}

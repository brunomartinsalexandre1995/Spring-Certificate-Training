package spring.ioc.container.iocContainer.others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponentWithLazyBean {

    @Autowired(required=false)
    @Lazy
    public LazyBean lazyBean;

    @Autowired
    public LazyBean2 lazyBean2;

}

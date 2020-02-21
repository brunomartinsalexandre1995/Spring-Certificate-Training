package spring.ioc.container.iocContainer.lifecycle.destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class ClassWithDestroyInterface implements DisposableBean {


    @Override
    public void destroy() throws Exception {

    }
}

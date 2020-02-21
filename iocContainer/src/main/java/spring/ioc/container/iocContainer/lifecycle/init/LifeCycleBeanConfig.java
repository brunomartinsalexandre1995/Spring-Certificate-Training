package spring.ioc.container.iocContainer.lifecycle.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleBeanConfig {

    @Bean(initMethod = "add10")
    public LifeCycleBean createBan(){
        return new LifeCycleBean();
    }

}

package spring.ioc.container.iocContainer.others;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OthersConfig {


    @Bean
    @Lazy
    public LazyBean lazyBean(){
        return new LazyBean(new Date());
    }

    @Bean
    @Lazy
    public LazyBean2 lazyBean2(){
        return new LazyBean2();
    }
}

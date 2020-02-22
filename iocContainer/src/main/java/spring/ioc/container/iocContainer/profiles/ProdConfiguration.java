package spring.ioc.container.iocContainer.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Prod")
public class ProdConfiguration {

    @Bean
    public SomeProfileTestBean createBean(){
        return new SomeProfileTestBean(20);
    }
}

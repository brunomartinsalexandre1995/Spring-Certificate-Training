package spring.ioc.container.iocContainer.scalars.collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CollectionsConfig {

    @Bean
    public List<String> varOne(){
        List<String> values = new ArrayList<>();
        values.add("Bruno");
        return values;
    }




}

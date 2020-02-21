package spring.ioc.container.iocContainer.scalars.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ScalarConfig {

    @Autowired
    private StringToPersonConverter stringToPersonConverter;

    @Bean
    public ConversionService conversionService(ConversionServiceFactoryBean factory) {
        return factory.getObject();
    }

    @Bean
    public ConversionServiceFactoryBean conversionServiceFactoryBean() {
        ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
        Set<Converter> set = new HashSet<>();
        set.add(stringToPersonConverter);
        factory.setConverters(set);
        return factory;
    }

}

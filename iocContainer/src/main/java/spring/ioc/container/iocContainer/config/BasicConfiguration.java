package spring.ioc.container.iocContainer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.ioc.container.iocContainer.beans.BeanThatWillHaveAliases;
import spring.ioc.container.iocContainer.beans.BeanWithDependency;
import spring.ioc.container.iocContainer.beans.SimpleBean;

@Configuration
public class BasicConfiguration {

    private int numberOfBeanWithDependencyBeansCreated = 0;
    private int numberOfSimpleBeansCreated = 0;

    public int getNumberOfBeanWithDependencyBeansCreated() {
        return numberOfBeanWithDependencyBeansCreated;
    }

    public int getNumberOfSimpleBeansCreated() {
        return numberOfSimpleBeansCreated;
    }

    @Bean(name = {"alias1", "alias2"})
    public BeanThatWillHaveAliases createBeanThatWillHAveAliases(){
        return new BeanThatWillHaveAliases();
    }

    @Bean
    public SimpleBean createSimpleBean() {
        numberOfSimpleBeansCreated++;
        return new SimpleBean(10, 10);
    }

    @Bean
    public BeanWithDependency createBeanWithDependency() {
        numberOfBeanWithDependencyBeansCreated++;
        return new BeanWithDependency(createSimpleBean());
    }
}

package spring.ioc.container.iocContainer.beanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreationConfiguration {

    private int numberOfBeanWithDependencyBeansCreated = 0;
    private int numberOfSimpleBeansCreated = 0;

    int getNumberOfBeanWithDependencyBeansCreated() {
        return numberOfBeanWithDependencyBeansCreated;
    }

    int getNumberOfSimpleBeansCreated() {
        return numberOfSimpleBeansCreated;
    }

    @Bean(name = {"alias1", "alias2"})
    public BeanWillAliases createBeanThatWillHAveAliases() {
        return new BeanWillAliases();
    }

    @Bean
    public BeanBasic createSimpleBean() {
        numberOfSimpleBeansCreated++;
        return new BeanBasic(10, 10);
    }

    @Bean
    public BeanWithDependencies createBeanWithDependency() {
        numberOfBeanWithDependencyBeansCreated++;
        return new BeanWithDependencies(createSimpleBean());
    }
}

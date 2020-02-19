package spring.ioc.container.iocContainer.beanCreation;


public class BeanWithDependencies {

    public BeanBasic getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(BeanBasic simpleBean) {
        this.simpleBean = simpleBean;
    }

    private BeanBasic simpleBean;

    public BeanWithDependencies(BeanBasic simpleBean) {
        this.simpleBean = simpleBean;
    }

}

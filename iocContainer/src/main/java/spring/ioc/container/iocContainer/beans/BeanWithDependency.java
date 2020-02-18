package spring.ioc.container.iocContainer.beans;


public class BeanWithDependency {

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    private SimpleBean simpleBean;

    public BeanWithDependency(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

}

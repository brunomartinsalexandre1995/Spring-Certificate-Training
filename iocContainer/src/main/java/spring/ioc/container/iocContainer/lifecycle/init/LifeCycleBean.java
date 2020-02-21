package spring.ioc.container.iocContainer.lifecycle.init;

public class LifeCycleBean {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x = 0;

    private void add10(){
        x +=10;
    }


}

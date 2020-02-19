package spring.ioc.container.iocContainer.beanCreation;


public class BeanBasic {

    private int x;

    public int getY() {
        return y;
    }

    private int y;

    public BeanBasic(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

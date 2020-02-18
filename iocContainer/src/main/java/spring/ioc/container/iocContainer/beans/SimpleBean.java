package spring.ioc.container.iocContainer.beans;


public class SimpleBean {

    private int x;

    public int getY() {
        return y;
    }

    private int y;

    public SimpleBean(int x, int y) {
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

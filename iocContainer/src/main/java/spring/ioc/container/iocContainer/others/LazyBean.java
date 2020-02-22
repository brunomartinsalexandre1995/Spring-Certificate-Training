package spring.ioc.container.iocContainer.others;

import javax.annotation.PostConstruct;
import java.util.Date;

public class LazyBean {

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date createDate;

    public  LazyBean(Date date){
        this.createDate = date;
    }
}

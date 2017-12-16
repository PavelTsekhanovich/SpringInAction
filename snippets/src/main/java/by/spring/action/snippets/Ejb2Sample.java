package by.spring.action.snippets;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class Ejb2Sample implements SessionBean {

    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void ejbRemove() {
    }

    public void setSessionContext(SessionContext ctx) {
    }

    public String sayHello() {
        return "Hello World";
    }

    public void ejbCreate() {
    }
}

class HelloWorldBean {
    public String sayHello() {
        return "Hello World";
    }
}



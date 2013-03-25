/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LongMin
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;
import test.cpt.HelloWorldComponent;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldTag extends ComponentTagSupport {

    private static final long serialVersionUID = 7767836903901043944L;

    private String name;

    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req,
            HttpServletResponse res) {
        return new HelloWorldComponent(stack);
    }

    @Override
    protected void populateParams() {
        HelloWorldComponent component = (HelloWorldComponent)getComponent();
        component.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

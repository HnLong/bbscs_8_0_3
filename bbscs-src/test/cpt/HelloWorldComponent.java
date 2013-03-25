/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cpt;

/**
 *
 * @author LongMin
 */
import java.io.IOException;
import java.io.Writer;

import org.apache.struts2.components.Component;

import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldComponent extends Component {

    private String name;

    public HelloWorldComponent(ValueStack stack) {
        super(stack);
    }

    @Override
    public boolean start(Writer writer) {
        try {
            writer.write(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean end(Writer writer, String body) {
        try {
            writer.write("tag end");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.end(writer, body);
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.stream.XMLStreamWriter;
import java.io.File;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setup(){
        this.constructorInjectionController = new ConstructorInjectionController(new InjectionServiceImpl());
    }

    @Test
    public void testMessage(){
        Assert.assertEquals(InjectionServiceImpl.MESSAGE, constructorInjectionController.testService());

    }
}

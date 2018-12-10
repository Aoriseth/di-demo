package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FieldInjectionControllerTest {

    private FieldInjectionController fieldInjectionController;

    @Before
    public void setup(){
        this.fieldInjectionController = new FieldInjectionController();
        this.fieldInjectionController.injectionServiceImpl = new InjectionServiceImpl();
    }

    @Test
    public void testMessage(){
        Assert.assertEquals(InjectionServiceImpl.MESSAGE,fieldInjectionController.testService());
    }
}

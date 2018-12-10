package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setup(){
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setInjectionService(new InjectionServiceImpl());
    }

    @Test
    public void testMessage(){
        Assert.assertEquals(InjectionServiceImpl.MESSAGE,setterInjectionController.testService());
    }
}

package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectionController {

    // Field needs @autowired annotation
    // We don't need to specify a qualifier here because spring finds the correct bean by reflection
    // If multiple options are available, the name of the variable will be used to find a specific implementation
    @Autowired
    public InjectionService injectionServiceImpl;

    public String testService(){
        return injectionServiceImpl.messageCall();
    }
}

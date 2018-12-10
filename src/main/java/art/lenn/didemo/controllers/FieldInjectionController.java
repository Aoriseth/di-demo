package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectionController {

    // Field needs @autowired annotation
    // We don't need to specify a qualifier here because spring finds the correct bean by reflection
    // If multiple options are available, the name of the variable will be used to find a specific implementation
    // If a @Primary service is available, this will be used instead of looking at the variable name. Test this by removing @Qualifier
    @Autowired
    @Qualifier("injectionServiceImpl")
    public InjectionService injectionServiceImpl;

    public String testService(){
        return injectionServiceImpl.messageCall();
    }
}

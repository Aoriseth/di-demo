package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private InjectionService injectionService;

    public String testService(){
        return injectionService.messageCall();
    }

    // Constructor does not need @Autowired annotation
    // @Autowired
    public ConstructorInjectionController( @Qualifier("constructorInjectionService")  InjectionService injectionService) {
        this.injectionService = injectionService;
    }
}

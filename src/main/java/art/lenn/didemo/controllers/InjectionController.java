package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionService;
import org.springframework.stereotype.Controller;

// @Controller annotation will make a bean from this class and instanciate it when the application context is created
// This bean will be of Type InjectionController and will have the name "injectionController" (Lowercase i)
@Controller
public class InjectionController {

    private InjectionService injectionService;

    public InjectionController(InjectionService injectionService) {
        this.injectionService = injectionService;
    }

    public void inject(){
        System.out.println("Running");
        System.out.println(injectionService.messageCall());
    }
}

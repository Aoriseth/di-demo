package art.lenn.didemo.controllers;

import art.lenn.didemo.services.InjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {


    private InjectionService injectionService;

    public String testService(){
        return injectionService.messageCall();
    }

    // Setter needs autowired annotation
    @Autowired
    public void setInjectionService(@Qualifier("setterInjectionService") InjectionService injectionService) {
        this.injectionService = injectionService;
    }

}

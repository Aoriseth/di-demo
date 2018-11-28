package art.lenn.didemo.controllers;

import org.springframework.stereotype.Controller;

// @Controller annotation will make a bean from this class and instanciate it when the application context is created
// This bean will be of Type InjectionController and will have the name "injectionController" (Lowercase i)
@Controller
public class InjectionController {

    public void inject(){
        System.out.println("Running");
    }
}

package art.lenn.didemo;

import art.lenn.didemo.controllers.ConstructorInjectionController;
import art.lenn.didemo.controllers.FieldInjectionController;
import art.lenn.didemo.controllers.InjectionController;
import art.lenn.didemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"art.lenn.didemo.controllers","art.lenn.didemo.services"})
//@ComponentScan("art.lenn.didemo.configuration") // Commenting this line will disable the BeanPostProcessor because it is not loaded into the spring context
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		// Will capture the bean named: injectionController
		// Works with either the name (needs cast) or via the class Type
		InjectionController contrViaBeanName = (InjectionController) context.getBean("injectionController");
		InjectionController contrViaClassName = context.getBean(InjectionController.class);

		if (contrViaBeanName==contrViaClassName){ System.out.println("Both instances are the same"); }
		else { System.out.println("These instances are different"); }

		contrViaBeanName.inject();
		contrViaClassName.inject();

        SetterInjectionController setcont = (SetterInjectionController) context.getBean("setterInjectionController");
        System.out.println(setcont.testService());

        ConstructorInjectionController concont = (ConstructorInjectionController) context.getBean("constructorInjectionController");
        System.out.println(concont.testService());

        FieldInjectionController fieldcont = (FieldInjectionController) context.getBean("fieldInjectionController");
        System.out.println(fieldcont.testService());

	}
}

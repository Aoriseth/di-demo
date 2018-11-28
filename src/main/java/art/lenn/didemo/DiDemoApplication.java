package art.lenn.didemo;

import art.lenn.didemo.controllers.InjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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
	}
}

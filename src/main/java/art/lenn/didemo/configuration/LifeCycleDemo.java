package art.lenn.didemo.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemo() {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("setBeanFactory:"+beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("setBeanName:"+s);
    }

    @Override
    public void destroy() {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("Destroyed");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("setApplicationContext:"+applicationContext.toString());
    }

    @PostConstruct
    public void postCons(){
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDest(){
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("PreDestroy");
    }

    void beforeInit(){
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("beforeInit");
    }

    void afterInit(){
        System.out.print(">> LifeCycleDemo - ");
        System.out.println("afterInit");
    }

}

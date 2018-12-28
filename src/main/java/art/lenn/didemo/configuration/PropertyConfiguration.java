package art.lenn.didemo.configuration;


import art.lenn.didemo.FakeDataSource;
import art.lenn.didemo.FakeJMSBroker;
import art.lenn.didemo.FakeMessageQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})

// Alternative way to set multiple property files:
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class PropertyConfiguration {

    private final Environment env;


    @Value("${didemo.username}")
    String user;
    @Value("${didemo.password}")
    String password;
    @Value("${didemo.url}")
    String url;

    @Value("${didemo.jms.username}")
    String jmsUser;
    @Value("${didemo.jms.password}")
    String jmsPass;
    @Value("${didemo.jms.url}")
    String jmsUrl;

    @Value("${didemo.queue.username}")
    String queueUser;
    @Value("${didemo.queue.password}")
    String queuePass;
    @Value("${didemo.queue.url}")
    String queueUrl;



    @Autowired
    public PropertyConfiguration(Environment env) {
        this.env = env;
    }


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUser(user);
        fakeDataSource.setUser(env.getProperty("DIDEMOENV_USERNAME"));
//        fakeDataSource.setPassword(password);
        fakeDataSource.setPassword(env.getProperty("DIDEMOENV_PASSWORD"));
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }


    @Bean
    public FakeJMSBroker fakeJmsBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUser(jmsUser);
        fakeJMSBroker.setPassword(jmsPass);
        fakeJMSBroker.setUrl(jmsUrl);

        return fakeJMSBroker;
    }

    @Bean
    public FakeMessageQueue fakeMessageQueue(){
        FakeMessageQueue fakeMessageQueue = new FakeMessageQueue();
        fakeMessageQueue.setUser(queueUser);
        fakeMessageQueue.setPassword(queuePass);
        fakeMessageQueue.setUrl(queueUrl);

        return fakeMessageQueue;
    }



    @Bean
    public static PropertySourcesPlaceholderConfigurer pspc(){
        return new PropertySourcesPlaceholderConfigurer();
    }




}

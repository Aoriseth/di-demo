package art.lenn.didemo.configuration;


import art.lenn.didemo.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfiguration {

    private final Environment env;


    @Value("${didemo.username}")
    String user;

    @Value("${didemo.password}")
    String password;

    @Value("${didemo.url}")
    String url;

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
    public static PropertySourcesPlaceholderConfigurer pspc(){
        return new PropertySourcesPlaceholderConfigurer();
    }


}

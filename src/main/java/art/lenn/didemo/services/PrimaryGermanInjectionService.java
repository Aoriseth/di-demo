package art.lenn.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanInjectionService implements InjectionService {

    @Override
    public String messageCall() {
        return "Einspritzung über den Hauptdienst";
    }
}

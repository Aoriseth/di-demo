package art.lenn.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("nl")
@Primary
public class PrimaryDutchInjectionService implements InjectionService {
    @Override
    public String messageCall() {
        return "Injectering via de primaire annotatie.";
    }
}

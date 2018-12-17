package art.lenn.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// The primary service will always be used when multiple options for bean injection are possible.
// Primary will take precedence over other ways that spring figures out multiple options
@Service
@Primary
@Profile({"en","default"})
public class PrimaryInjectionService implements InjectionService {
    @Override
    public String messageCall() {
        return "Injection via the primary annotation.";
    }
}

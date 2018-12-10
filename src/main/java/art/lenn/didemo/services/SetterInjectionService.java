package art.lenn.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionService implements InjectionService {
    @Override
    public String messageCall() {
        return "Injection via the setter.";
    }
}

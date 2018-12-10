package art.lenn.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
    public static final String MESSAGE = "Injection via default.";

    @Override
    public String messageCall() {
        return MESSAGE;
    }
}

package art.lenn.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
    @Override
    public String messageCall() {
        return "Message";
    }
}

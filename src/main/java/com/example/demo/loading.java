import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class LazyService {
    public LazyService() {
        System.out.println("LazyService Initialized!");
    }

    public String getMessage() {
        return "This is a lazy-loaded service!";
    }
}

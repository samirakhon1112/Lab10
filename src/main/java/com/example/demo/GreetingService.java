import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;
    private final FarewellService farewellService;

    public GreetingController(@Qualifier("greetingServiceImpl") GreetingService greetingService,
                              FarewellService farewellService) {
        this.greetingService = greetingService;
        this.farewellService = farewellService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }

    @GetMapping("/farewell")
    public String farewell() {
        return farewellService.getFarewell();
    }
}

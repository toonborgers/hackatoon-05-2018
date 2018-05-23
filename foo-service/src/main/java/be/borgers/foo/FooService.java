package be.borgers.foo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FooService {
    @HystrixCommand(fallbackMethod = "fallbackGetFoo")
    String getFoo() {
        return "Foo " + new RestTemplate().getForEntity("http://bar-service:8080/bar", String.class).getBody();
    }

    String fallbackGetFoo() {
        return "Default foo";
    }

}

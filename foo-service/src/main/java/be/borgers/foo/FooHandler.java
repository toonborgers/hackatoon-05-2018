package be.borgers.foo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@Component
public class FooHandler {
    public Mono<ServerResponse> handle(ServerRequest request) {
        return ServerResponse.ok().body(fromObject("Foo"));
    }
}

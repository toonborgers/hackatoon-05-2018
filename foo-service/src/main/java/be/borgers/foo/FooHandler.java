package be.borgers.foo;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class FooHandler {
    private final WebClient webclient;

    public FooHandler() {
        webclient = WebClient.create("http://bar-service:8080");
    }

    Mono<ServerResponse> handle(ServerRequest request) {
        Mono<String> rMono = webclient.method(HttpMethod.GET)
                .uri("/bar")
                .exchange()
                .map(response -> response.bodyToMono(String.class))
                .flatMap(stringMono -> stringMono.map(s -> "Foo " + s));

        return ok().body(rMono, String.class);
    }
}

package be.borgers.bar

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class BarHandler {
    fun handle(req: ServerRequest): Mono<ServerResponse> = ok().body(fromObject("Bar from " + System.getenv("HOSTNAME")))
}
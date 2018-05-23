package be.borgers.bar

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class BarHandler {
    fun handle(req: ServerRequest): Mono<ServerResponse> = ServerResponse.ok().body(BodyInserters.fromObject("Bar"))
}
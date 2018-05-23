package be.borgers.bar

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.HandlerFunction
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class WebConfig {
    @Bean
    fun routes(handler: BarHandler) = route(GET("/bar"), HandlerFunction<ServerResponse>(handler::handle))
}
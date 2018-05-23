package be.borgers.bar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BarApplication

fun main(args: Array<String>) {
    runApplication<BarApplication>(*args)
}

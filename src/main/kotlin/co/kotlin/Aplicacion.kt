package co.kotlin
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
public open class Aplicacion

fun main(args: Array<String>) {
    runApplication<Aplicacion>(*args)
}
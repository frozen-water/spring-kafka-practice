package org.example.myspringkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySpringKafkaApplication

fun main(args: Array<String>) {
    runApplication<MySpringKafkaApplication>(*args)
}

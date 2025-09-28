package org.example.myspringkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class MySpringKafkaApplication

fun main(args: Array<String>) {
    runApplication<MySpringKafkaApplication>(*args)
}

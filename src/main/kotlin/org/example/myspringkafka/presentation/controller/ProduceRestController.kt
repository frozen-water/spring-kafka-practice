package org.example.myspringkafka.presentation.controller

import org.example.myspringkafka.presentation.kafka.producer.MyKafkaProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/produces")
class ProduceRestController(
    private val myProducer: MyKafkaProducer
) {

    @PostMapping
    fun produceDumpData() {
        myProducer.sendMessage("topic1", null, "message")
    }
}
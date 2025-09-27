package org.example.myspringkafka.presentation.kafka.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class MyKafkaConsumer {

    private val logger = LoggerFactory.getLogger(MyKafkaConsumer::class.java)

    @KafkaListener(
        topics = ["topic1"],
        groupId = "group1",
    )
    fun consume(
        message: String
    ) {
        logger.info("Consuming message: $message")
    }
}
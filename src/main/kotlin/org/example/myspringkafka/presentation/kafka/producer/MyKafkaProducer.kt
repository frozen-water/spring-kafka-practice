package org.example.myspringkafka.presentation.kafka.producer

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class MyKafkaProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    private val logger = LoggerFactory.getLogger(MyKafkaProducer::class.java)

    fun sendMessage(topic: String, key: String?, message: String) {
        logger.info("Sending message='{}' to topic='{}'", message, topic)
        if (key != null) {
            kafkaTemplate.send(topic, key, message)
        } else {
            kafkaTemplate.send(topic, message)
        }
    }
}
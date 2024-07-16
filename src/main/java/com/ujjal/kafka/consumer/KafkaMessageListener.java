package com.ujjal.kafka.consumer;

import com.ujjal.kafka.models.CustomerDetail;
import com.ujjal.kafka.models.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.SameIntervalTopicReuseStrategy;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.ujjal.kafka.util.Constants.*;


@Service
@Slf4j
public class KafkaMessageListener {

    @RetryableTopic(
            backoff = @Backoff(delay = 3000L),
            attempts = "4",
            autoCreateTopics = "true", sameIntervalTopicReuseStrategy = SameIntervalTopicReuseStrategy.MULTIPLE_TOPICS)
    @KafkaHandler
    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_NAME)
    public void consumeCustomer(CustomerDetail customer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.OFFSET) long offset) {
//        try {
        log.info("customer details reached consumer: {}", customer.toString());
        Optional.of(customer).filter(details -> details.getAge() > 18).ifPresentOrElse(
                cus -> log.info("customer details processed: {}", cus),
                () -> {
                    throw new RuntimeException("Failed to process Customer details, Minors not allowed.");
                });
//        } catch (Exception ex) {
//            log.error(CUSTOMER_PROCESSING_EXCEPTION, ex.getMessage(), ex);
//            throw ex;
//        }

    }

    @KafkaListener(topics = EMPLOYEE_TOPIC, groupId = EMPLOYEE_GROUP)
    public void consumeEmployee(ConsumerRecord<String, Employee> employeeRecord) {
        Optional<ConsumerRecord<String, Employee>> employeeRecord1 = Optional.ofNullable(employeeRecord);

        String key = employeeRecord1.flatMap(record -> Optional.ofNullable(record.key())).orElseThrow(RuntimeException::new);
        Employee employee = employeeRecord1.flatMap(record -> Optional.ofNullable(record.value())).orElseThrow(RuntimeException::new);
        log.info("Avro message Received for key: {}, value: {}", key, employee.toString());

    }

    @DltHandler
    public void listenDLT(CustomerDetail customer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.OFFSET) long offset) {
        log.info("DLT received : {}, from {}, offset {}", customer.getName(), topic, offset);
    }

    //to listen from a particular partition of a topic need to use @TopicPartition(topic = TOPIC_NAME,partitions = {"2"})
  /* @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_NAME,topicPartitions = {@TopicPartition(topic = TOPIC_NAME,partitions = {"2"})})
    public void consume(String message) {
        log.info("consumer1 consumes the message {}", message);

    }*/

    //dont create multiple consumers like the below code
    /*
    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_NAME)
    public void consume2(String message) {
        log.info("consumer2 consumes the message {}", message);

    }
    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_NAME)
    public void consume3(String message) {
        log.info("consumer3 consumes the message {}", message);

    }
    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_NAME)
    public void consume4(String message) {
        log.info("consumer4 consumes the message {}", message);

    }
    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_NAME)
    public void consume5(String message) {
        log.info("consumer5 consumes the message {}", message);

    }*/
}

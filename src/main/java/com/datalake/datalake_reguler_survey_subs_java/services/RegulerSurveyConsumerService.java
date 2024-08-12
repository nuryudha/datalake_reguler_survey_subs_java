package com.datalake.datalake_reguler_survey_subs_java.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegulerSurveyConsumerService {

    @Value("${spring.kafka.topic.test-datalake}")
    private String topicName;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupIdName;

    @KafkaListener(topics = "#{@topicName}", groupId = "#{@groupIdName}")
    public void listen(String message) {

    }
}

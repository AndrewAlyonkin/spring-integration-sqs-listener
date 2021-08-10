package edu.alenkin.springintegrationsqslistener.parsers;

import com.amazonaws.services.sqs.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.alenkin.springintegrationsqslistener.entity.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
@Service
public class NotificationMessageParser {

    @Autowired
    private ObjectMapper objectMapper;

    public Notification parse(String value) {
        try {
            return objectMapper.readValue(value, Notification.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}

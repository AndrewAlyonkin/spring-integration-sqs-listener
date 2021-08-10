package edu.alenkin.springintegrationsqslistener.queuelistener;

import edu.alenkin.springintegrationsqslistener.entity.Notification;
import edu.alenkin.springintegrationsqslistener.parsers.NotificationMessageParser;
import edu.alenkin.springintegrationsqslistener.service.NotificationService;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
@Component
@Slf4j
public class AwsSqsListener {

    private final NotificationService service;

    private final NotificationMessageParser parser;

    @Autowired
    public AwsSqsListener(NotificationService service, NotificationMessageParser parser) {
        this.service = service;
        this.parser = parser;
    }

    @SqsListener(value = "${aws.queue.url}", deletionPolicy = SqsMessageDeletionPolicy.ALWAYS)
    public void receiveMessage(String message) {
        log.info("Receive {}", message);
        Notification notification = parser.parse(message);
        service.save(notification);
    }

}

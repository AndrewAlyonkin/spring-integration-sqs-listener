package edu.alenkin.springintegrationsqslistener.service;

import edu.alenkin.springintegrationsqslistener.entity.Notification;
import edu.alenkin.springintegrationsqslistener.repository.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService{

    private final NotificationRepository repository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Notification notification) {
        log.info("Save {} to DB", notification);
        repository.save(notification);
    }

    @Override
    public void saveAll(List<Notification> notifications) {
        repository.saveAll(notifications);
    }
}

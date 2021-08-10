package edu.alenkin.springintegrationsqslistener.service;

import edu.alenkin.springintegrationsqslistener.entity.Notification;

import java.util.List;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
public interface NotificationService {
    void save(Notification notification);

    void saveAll(List<Notification> notifications);
}

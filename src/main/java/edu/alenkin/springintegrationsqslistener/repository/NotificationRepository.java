package edu.alenkin.springintegrationsqslistener.repository;

import edu.alenkin.springintegrationsqslistener.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
public interface NotificationRepository extends JpaRepository<Notification, String> {
}

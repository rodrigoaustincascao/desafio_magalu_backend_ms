package com.example.magalums.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magalums.entities.Notification;
import com.example.magalums.entities.Status;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndDateTimeBefore(List<Status> of, LocalDateTime dateTime);

}

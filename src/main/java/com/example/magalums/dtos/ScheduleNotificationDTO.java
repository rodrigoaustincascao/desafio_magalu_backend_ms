package com.example.magalums.dtos;

import java.time.LocalDateTime;
import com.example.magalums.entities.Channel;
import com.example.magalums.entities.Notification;
import com.example.magalums.entities.Status;

public record ScheduleNotificationDTO(LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }

}

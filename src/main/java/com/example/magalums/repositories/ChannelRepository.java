package com.example.magalums.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magalums.entities.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {

}

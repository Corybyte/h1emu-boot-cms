package com.example.h1emubootcms.service;

import com.example.h1emubootcms.entity.EventEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    public  int InsertEvent(EventEntity entity);

    public List<EventEntity> queryAll();

    public  int truncateEvent();

}

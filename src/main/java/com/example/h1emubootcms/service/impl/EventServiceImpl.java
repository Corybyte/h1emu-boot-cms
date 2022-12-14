package com.example.h1emubootcms.service.impl;

import com.example.h1emubootcms.entity.EventEntity;
import com.example.h1emubootcms.mapper.EventMapper;
import com.example.h1emubootcms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl  implements EventService {

    @Autowired
    EventMapper mapper;


    @Override
    public int InsertEvent(EventEntity entity) {

        return mapper.InsertEvent(entity);
    }

    @Override
    public List<EventEntity> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int truncateEvent() {
        return mapper.truncateEvent();
    }

}

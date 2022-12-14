package com.example.h1emubootcms.mapper;

import com.example.h1emubootcms.entity.EventEntity;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EventMapper {

    @Insert(value = {"insert into Event (EventName,EventType) values (#{EventName},#{EventType})"})
    public  int InsertEvent(EventEntity entity);

    @Select(value = {"select * from Event"})
    public List<EventEntity> queryAll();

    @Delete(value = {"truncate  table Event"})
    public  int  truncateEvent();



}

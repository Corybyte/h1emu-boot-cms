package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Event")
public class EventEntity {
    @TableField("EventID")
    private  Integer EventID;
    @TableField("EventName")
    private String EventName;
    @TableField("EventType")
    private String EventType;
}

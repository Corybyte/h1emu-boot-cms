package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;


@Data
@TableName("QQWelcome")
public class WelcomeEntity {
    @TableId(value = "QQID",type = IdType.AUTO)
    private Integer QQID;
    @TableField("QQGroupID")
    private Integer QQGroupID;
    @TableField("content")
    private String content;

}

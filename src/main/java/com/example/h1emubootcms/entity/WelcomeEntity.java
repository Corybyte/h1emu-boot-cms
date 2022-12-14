package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("QQWelcome")
@Data
public class WelcomeEntity {
    @TableId(value = "QQID",type = IdType.NONE)
    private String QQID;
    @TableField("QQGroupID")
    private String QQGroupID;
    private String content;
}

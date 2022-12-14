package com.example.h1emubootcms.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "QQMember")
@Data
public class MemberEntity {

    @TableId(value = "QQID",type = IdType.NONE)
    private  String QQID;

    @TableField("QQName")
    private  String QQName;

    @TableField("JoinTmestamp")
    private  String   JoinTimestamp;

    @TableField("lastSpeakTimestamp")
    private  String lastSpeakTimestamp;

    @TableField("QQGroupID")
    private  String QQGroupID;

}

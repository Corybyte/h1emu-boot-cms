package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@TableName("MemberBlackList")

public class MemberBlackList {
    @TableId(value = "QQID",type = IdType.NONE)
    private  String QQID;
    @TableField("QQName")
    private  String QQName;
    @TableField("exitGroupID")
    private  String exitGroupID;
    @TableField("exitGroupName")
    private String exitGroupName;
    @TableField("exitGroupAvatar")
    private String exitGroupAvatar;
    @TableField("QQEmail")
    private  String QQEmail;
    @TableField("QQSign")
    private  String QQSign;
    @TableField("QQAge")
    private  String QQAge;
    @TableField("QQLevel")
    private  String QQLevel;

}

package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("QQGroup")
@Data
public class GroupEntity {
    @TableId(value = "QQGroupID",type= IdType.NONE)
    private  String QQGroupID;
    @TableField(value = "QQGroupName")
    private  String QQGroupName;
    @TableField(value = "QQGroupAvatarurl")
    private String QQGroupAvatarurl;
    @TableField(value = "QQGroupSize")
    private  Integer QQGroupSize;
}

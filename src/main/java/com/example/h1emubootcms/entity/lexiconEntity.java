package com.example.h1emubootcms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@RestController
@TableName("lexicon")
@Data
public class lexiconEntity {
    @TableId(value = "ID",type= IdType.NONE)
    private  Integer ID;
    @TableField("TYPE")
    private  String  TYPE;
    @TableField("WORDS")
    private  String  WORDS;
}

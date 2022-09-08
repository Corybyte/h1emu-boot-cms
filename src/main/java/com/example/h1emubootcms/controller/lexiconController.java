package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSON;
import com.example.h1emubootcms.entity.lexiconEntity;
import com.example.h1emubootcms.mapper.senstiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lexiconController {
    @Autowired
    senstiveMapper mapper;
    @Resource
    lexiconEntity entity;
    @RequestMapping("/lexicon/getlexicon")
    public String hello(){
        List<lexiconEntity> list = mapper.selectAll();
        String json = JSON.toJSONString(list);
        return json;
    }

}

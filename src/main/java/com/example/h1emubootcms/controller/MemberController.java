package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.entity.GroupEntity;
import com.example.h1emubootcms.entity.MemberEntity;
import com.example.h1emubootcms.service.GroupService;
import com.example.h1emubootcms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author CoryByte
 * @Date 2022/11/2 下午10:38 （可以根据需要修改）
 * @Version 1.0 （版本号）
 */
@RestController
@RequestMapping("/Member")
public class MemberController {

    @Autowired
    MemberService service;
    MemberEntity entity = new MemberEntity();


    @RequestMapping(value = "/UpdateMember",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String update_Mapper(@RequestBody JSONObject jsonParam){
        entity.setQQID(jsonParam.getString("QQID"));
        entity.setQQName(jsonParam.getString("QQName"));
        entity.setJoinTimestamp(jsonParam.getString("JoinTimestamp"));
        entity.setLastSpeakTimestamp(jsonParam.getString("LastSpeakTimestamp"));
        entity.setQQGroupID(jsonParam.getString("QQGroupID"));
        service.InsertMember(entity);
        return null;
    }


}

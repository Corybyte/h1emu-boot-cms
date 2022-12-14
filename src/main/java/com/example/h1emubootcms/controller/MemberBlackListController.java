package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.entity.MemberBlackList;
import com.example.h1emubootcms.service.MemberBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.endpoint.GenericMessageEndpointFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MemberBlackList")
public class MemberBlackListController {
    @Autowired
    MemberBlackListService service;

    MemberBlackList entity = new MemberBlackList();

    @RequestMapping("/addMemberBlackList")
    public String addMemberBlackList(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toJSONString());
        entity.setQQID(jsonParam.getString("QQID"));
        entity.setQQName(jsonParam.getString("QQName"));
        entity.setExitGroupID(jsonParam.getString("exitGroupId"));
        entity.setExitGroupName(jsonParam.getString("exitGroupName"));
        entity.setExitGroupAvatar(jsonParam.getString("exitGroupAvatar"));
        entity.setQQAge(jsonParam.getString("QQAge"));
        entity.setQQEmail(jsonParam.getString("QQEmail"));
        entity.setQQLevel(jsonParam.getString("QQLevel"));
        entity.setQQSign(jsonParam.getString("QQSign"));
        System.out.println(entity.toString());
        service.addMemberBlackList(entity);
        return null;
    }

    @RequestMapping("/deleteMemberBlackList/{QQID}")
    public int deleteMemberBlackList(@PathVariable("QQID") String QQID){
        System.out.println("delete");
        return service.deleteMemberBlackList(QQID);
    }

    @RequestMapping("/queryAll")
    public List<MemberBlackList> queryAll(){
        return service.queryAll();
    }
}

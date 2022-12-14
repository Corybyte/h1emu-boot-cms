package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.H1emuBootCmsApplication;
import com.example.h1emubootcms.entity.GroupEntity;
import com.example.h1emubootcms.entity.HTTPEntity;
import com.example.h1emubootcms.mapper.GroupMapper;
import com.example.h1emubootcms.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.TimerTask;

/**
 * @Author CoryByte
 * @Date 2022/11/2 下午10:38 （可以根据需要修改）
 * @Version 1.0 （版本号）
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    GroupService service;

    GroupEntity entity = new GroupEntity();

    HTTPEntity httpEntity =new HTTPEntity();

    @CrossOrigin
    @RequestMapping(value = "/updateGroup",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String uopdate_Mapper(@RequestBody JSONObject jsonParam){
        entity.setQQGroupID((String) jsonParam.get("QQGroupID"));
        entity.setQQGroupName((String) jsonParam.get("QQGroupName").toString().replace("\uD83D\uDCB0",""));
        entity.setQQGroupSize((Integer) jsonParam.get("QQGroupSize"));
        entity.setQQGroupAvatarurl((String) jsonParam.get("QQGroupAvatarurl"));
        if (service.selectByIDGoup(entity.getQQGroupID())!=null){
           service.DeleteByiIdGroup(entity.getQQGroupID());
           if(service.InsertGroup(entity)==1){
               return "suceess";
           }else {
               return  "error";
           }
        }
        return  "特殊异常";
    }

    @CrossOrigin
    @RequestMapping(value = "/queryGroup",method = RequestMethod.GET)
    public  String Query_Mapper(){
        JSONObject jsonObject =new JSONObject();
        if (service.QueryAll()!=null){
            httpEntity.setCode(200);
            httpEntity.setMessage("sucess");
            httpEntity.setData(service.QueryAll().toString());
            jsonObject.put("code",HTTPEntity.success());
            jsonObject.put("message","success");
            jsonObject.put("data",service.QueryAll());
        }
        return jsonObject.toString();
    }


}


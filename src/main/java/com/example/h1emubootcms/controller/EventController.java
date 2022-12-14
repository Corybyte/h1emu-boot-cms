package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSON;
import com.example.h1emubootcms.entity.EventEntity;
import com.example.h1emubootcms.entity.HTTPEntity;
import com.example.h1emubootcms.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/event")
@RestController
public class EventController {
    EventEntity entity = new EventEntity();

    HTTPEntity httpEntity =new HTTPEntity();

    @Autowired
    EventService service;

    @CrossOrigin
    @RequestMapping("/queryAll")
    public  String  queryAll(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", JSONObject.toJSONString(service.queryAll()));
       return jsonObject.toString( );
    }


    @CrossOrigin
    @RequestMapping("/InsertEvent")
    public  String InsetEvent(@RequestParam("EventName") String EventName,@RequestParam("EventType") String EventType){
        JSONObject jsonObject = new JSONObject();
        entity.setEventName(EventName);
        entity.setEventType(EventType);

        if(service.InsertEvent(entity)==1){
            httpEntity.setCode(HTTPEntity.success());
            httpEntity.setMessage("success");
            httpEntity.setData(jsonObject.toString());
            jsonObject.put("code",HTTPEntity.success());
            jsonObject.put("message","success");
            jsonObject.put("stauts","success");
            return  jsonObject.toString();
        }else {
            jsonObject.put("code",HTTPEntity.error());
            jsonObject.put("message","error");
            jsonObject.put("stauts","错误");
            return  jsonObject.toString();
        }
    }

    @CrossOrigin
    @RequestMapping("/truncateEvent")
    public  void   truncateEvent(){
        service.truncateEvent();
    }
}

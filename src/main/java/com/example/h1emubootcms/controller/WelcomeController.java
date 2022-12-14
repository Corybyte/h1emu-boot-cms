package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.entity.HTTPEntity;
import com.example.h1emubootcms.entity.WelcomeEntity;
import com.example.h1emubootcms.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Resource
    private WelcomeService welcomeService;

    HTTPEntity httpEntity =new HTTPEntity();

    @RequestMapping("/add")
    public int addWelcome(@RequestBody WelcomeEntity welcome){
        return welcomeService.addWelcomeMapper(welcome);
    }

    @RequestMapping("/update/id")
    public int updateWelcome(@PathVariable("id") String QQID,String content){
        return welcomeService.updateWelcomeMapper(QQID,content);
    }


    @RequestMapping("/delete/{id}")
    public int deleteWelcome(@PathVariable("id") String id){
        return welcomeService.deleteWelcomeMapper(id);
    }

    @GetMapping("/queryAll")
    public String queryAll(){
        JSONObject jsonObject = new JSONObject();
        if(welcomeService != null){
            httpEntity.setCode(200);
            httpEntity.setMessage("sucess");
            httpEntity.setData(welcomeService.queryAll().toString());
            jsonObject.put("code",HTTPEntity.success());
            jsonObject.put("message","sucess");
            jsonObject.put("data",welcomeService.queryAll());
        }
        return jsonObject.toString();
    }




}

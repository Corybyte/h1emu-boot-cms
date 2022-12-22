package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.entity.HTTPEntity;
import com.example.h1emubootcms.entity.WelcomeEntity;
import com.example.h1emubootcms.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Resource
    private WelcomeService welcomeService;

    HTTPEntity httpEntity =new HTTPEntity();

    @RequestMapping("/add")
    public Integer addWelcome( WelcomeEntity welcomeEntity){/*@RequestBody WelcomeEntity welcomeEntity*/
       /* WelcomeEntity welcomeEntity = new WelcomeEntity(112,321,"asda");*/
        /*System.out.println(welcomeEntity.toString());
        JSONObject jsonObject = new JSONObject();
        if(welcomeService != null){
            httpEntity.setCode(200);
            httpEntity.setMessage("sucess");
            httpEntity.setData(Integer.toString(welcomeService.addWelcomeMapper(welcomeEntity)));
            jsonObject.put("code",HTTPEntity.success());
            jsonObject.put("message","sucess");
            jsonObject.put("data",Integer.toString(welcomeService.addWelcomeMapper(welcomeEntity)));
            System.out.println(httpEntity.getMessage());
        }
        System.out.println("add");
        System.out.println(welcomeEntity.toString());
        System.out.println(jsonObject.toString());*/
        return welcomeService.addWelcomeMapper(welcomeEntity);
    }

    @RequestMapping("/update")
    public int updateWelcome( WelcomeEntity welcomeEntity){//@PathVariable("id") Integer QQID,String content

        JSONObject jsonObject = new JSONObject();
        if(welcomeService != null){
            httpEntity.setCode(200);
            httpEntity.setMessage("sucess");
            httpEntity.setData(Integer.toString(welcomeService.updateWelcomeMapper(welcomeEntity)));
            jsonObject.put("code",HTTPEntity.success());
            jsonObject.put("message","sucess");
            jsonObject.put("data",Integer.toString(welcomeService.updateWelcomeMapper(welcomeEntity)));
            System.out.println(httpEntity.getMessage());
        }
        return welcomeService.updateWelcomeMapper(welcomeEntity);
    }


    @RequestMapping("/delete/{id}")
    public int deleteWelcome(@PathVariable("id") String id){
        System.out.println("deleteID = "+id);
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
        /*return welcomeService.queryAll();*/
    }




}

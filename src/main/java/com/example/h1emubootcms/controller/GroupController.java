package com.example.h1emubootcms.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.h1emubootcms.H1emuBootCmsApplication;
import org.springframework.web.bind.annotation.*;

/**
 * @Author CoryByte
 * @Date 2022/11/2 下午10:38 （可以根据需要修改）
 * @Version 1.0 （版本号）
 */
@RestController
@RequestMapping("/Group")
public class GroupController {

    @RequestMapping(value = "/update_Mapper",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String update_Mapper(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toJSONString());
        return  null;
    }


}

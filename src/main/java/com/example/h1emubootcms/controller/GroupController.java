package com.example.h1emubootcms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 写你的名字
 * @Date 2022/11/2 下午10:38 （可以根据需要修改）
 * @Version 1.0 （版本号）
 */
@RestController
@RequestMapping("/Group")
public class GroupController {

    @RequestMapping("/update_Mapper")
    public String update_Mapper(@RequestParam(value="content")String content){
        return  content;
    }


}

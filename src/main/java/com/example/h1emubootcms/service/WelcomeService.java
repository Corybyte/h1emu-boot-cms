package com.example.h1emubootcms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.h1emubootcms.entity.MemberBlackList;
import com.example.h1emubootcms.entity.WelcomeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WelcomeService extends IService<WelcomeEntity> {

    public  int addWelcomeMapper(WelcomeEntity welcome);

    public List<WelcomeEntity> queryAll();

    public int deleteWelcomeMapper(String id);

    public int updateWelcomeMapper(WelcomeEntity welcome);//@Param("QQID") Integer QQID, @Param("content") String content

}

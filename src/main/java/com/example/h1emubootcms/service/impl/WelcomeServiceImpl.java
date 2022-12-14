package com.example.h1emubootcms.service.impl;

import com.example.h1emubootcms.entity.WelcomeEntity;
import com.example.h1emubootcms.mapper.WelcomeMapper;
import com.example.h1emubootcms.service.WelcomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Resource
    private WelcomeMapper welcomeMapper;

    @Override
    public int addWelcomeMapper(WelcomeEntity welcome) {
        return welcomeMapper.addWelcomeMapper(welcome);
    }

    @Override
    public List<WelcomeEntity> queryAll() {
        return welcomeMapper.queryAll();
    }

    @Override
    public int deleteWelcomeMapper(String id) {
        return welcomeMapper.deleteWelcomeMapper(id);
    }

    @Override
    public int updateWelcomeMapper(String QQID, String content) {
        return welcomeMapper.updateWelcomeMapper(QQID,content);
    }
}

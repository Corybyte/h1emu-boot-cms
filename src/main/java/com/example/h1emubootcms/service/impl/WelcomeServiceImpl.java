package com.example.h1emubootcms.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.h1emubootcms.entity.WelcomeEntity;
import com.example.h1emubootcms.mapper.WelcomeMapper;
import com.example.h1emubootcms.service.WelcomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WelcomeServiceImpl extends ServiceImpl<WelcomeMapper,WelcomeEntity> implements WelcomeService {

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
    public int updateWelcomeMapper(WelcomeEntity welcome) {
        return welcomeMapper.updateWelcomeMapper(welcome);
    }
}

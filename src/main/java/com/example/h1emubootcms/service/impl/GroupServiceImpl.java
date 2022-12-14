package com.example.h1emubootcms.service.impl;

import com.example.h1emubootcms.entity.GroupEntity;
import com.example.h1emubootcms.mapper.GroupMapper;
import com.example.h1emubootcms.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupMapper mapper;


    @Override
    public List<GroupEntity> QueryAll() {
        return mapper.QueryAll();
    }


    @Override
    public int InsertGroup(GroupEntity entity) {

        return mapper.insert(entity);
    }

    @Override
    public int TruncateGroupAll() {
        return mapper.TruncateGroup();
    }

    @Override
    public List<GroupEntity> selectByIDGoup(String QQGroupID) {
        return mapper.selectByIDGoup(QQGroupID);
    }

    @Override
    public int DeleteByiIdGroup(String QQGroupID) {
        return mapper.DeleteByiIdGroup(QQGroupID);

    }


}

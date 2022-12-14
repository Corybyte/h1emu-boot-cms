package com.example.h1emubootcms.service;

import com.example.h1emubootcms.entity.GroupEntity;
import com.example.h1emubootcms.entity.MemberEntity;

import java.util.List;

public interface GroupService {
    public List<GroupEntity> QueryAll();

    public int InsertGroup(GroupEntity entity);

    public  int TruncateGroupAll();

    public List<GroupEntity> selectByIDGoup(String QQGroupID);

    public  int DeleteByiIdGroup(String QQGroupID);

}

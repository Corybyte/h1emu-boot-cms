package com.example.h1emubootcms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.h1emubootcms.entity.GroupEntity;
import com.example.h1emubootcms.service.GroupService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface   GroupMapper extends BaseMapper<GroupEntity>{
    @Select(value = {"select * from QQGroup"})
    List<GroupEntity> QueryAll();

    @Insert(value = {"insert into QQGroup(QQGroupID,QQGroupName,QQGroupAvatarurl,QQGroupSize) values  (#{QQGroupID},#{QQGroupName},#{QQGruopAvatarurl},#{QQGroupSize})"})
    int InsertGroup(GroupEntity entity);

    @Delete(value = {"truncate table QQGroup"})
    int TruncateGroup();

    @Select(value = {"select * from QQGroup where QQGroupID=#{QQGroupID}"})
    List<GroupEntity> selectByIDGoup(String QQGroupID);

    @Delete(value = {"delete from QQGroup where QQGroupID = #{QQGroupID}"})
    int DeleteByiIdGroup(String QQGroupID);

}

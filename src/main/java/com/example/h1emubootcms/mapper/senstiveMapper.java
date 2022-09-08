package com.example.h1emubootcms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.h1emubootcms.entity.lexiconEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface senstiveMapper extends BaseMapper<lexiconEntity> {
    @Select("SELECT * FROM lexicon")
    List<lexiconEntity> selectAll();

}

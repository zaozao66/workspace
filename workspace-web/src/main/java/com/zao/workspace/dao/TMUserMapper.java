package com.zao.workspace.dao;


import com.zao.workspace.entity.TMUser;

import java.util.List;

public interface TMUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TMUser record);

    TMUser selectByPrimaryKey(Long id);

    List<TMUser> selectAll();

    int updateByPrimaryKey(TMUser record);
}
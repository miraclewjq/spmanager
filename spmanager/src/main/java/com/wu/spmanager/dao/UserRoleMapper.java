package com.wu.spmanager.dao;

import com.wu.spmanager.model.UserRoleExample;
import com.wu.spmanager.model.UserRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    List<UserRoleKey> selectByExample(UserRoleExample example);

    int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    /**
     * 根据用户获取用户角色中间表数据
     * @param userId
     * @return
     */
    List<UserRoleKey> findByUserId(int userId);
}
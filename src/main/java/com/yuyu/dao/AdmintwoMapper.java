package com.yuyu.dao;

import com.yuyu.pojo.Adminone;
import com.yuyu.pojo.Admintwo;
import org.apache.ibatis.annotations.Param;

public interface AdmintwoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admintwo record);

    int insertSelective(Admintwo record);

    Admintwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admintwo record);

    int updateByPrimaryKey(Admintwo record);

    int checkUsername(String username);

    Adminone selectLogin(@Param("username") String username, @Param("password") String password);

    int getAdminoneIdByusernmae(String usernmae);
}
package com.chuxin.demotodolist.mapper;

import com.chuxin.demotodolist.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,password) values (#{name},#{password})")
    Integer addUser(User user);

    @Update("update user set name=#{name},password=#{password} where id=#{id}")
    Integer updateUser(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteUser(Integer id);

    @Select("select * from user")
    List<User> getUserList();
}

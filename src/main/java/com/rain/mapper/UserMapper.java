package com.rain.mapper;

import com.rain.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author rain
 * created on 2018/3/31
 */
public interface UserMapper {
    /**
     * save user
     * @param user user
     * @return row
     */
    @Insert("INSERT INTO tab_user("
            + "user_id, user_name, user_password, user_img, user_address, register_date) "
            + "values(#{userId}, #{userName}, #{userPassword}, #{userImg}, #{userAddress}, #{registerDate})")
    int saveUser(User user);

    /**
     * save user
     * @param id id
     * @return row
     */
    @Select("SELECT user_id as userId, user_name as userName, user_password as userPassword, "
            + "user_img as userImg, user_address as userAddress, register_date as registerDate "
            + "FROM tab_user WHERE user_id = #{id}")
    User getUserByUserId(Integer id);

    /**
     * save user
     * @return row
     */
    @Select("SELECT user_id as userId, user_name as userName, user_password as userPassword, "
            + "user_img as userImg, user_address as userAddress, register_date as registerDate "
            + "FROM tab_user WHERE user_id = #{id}")
    List<User> getUserList();
}
package com.broit.day120301.mapper;
import com.broit.day120301.entity.UserInfo;
import org.apache.catalina.mapper.Mapper;
import java.util.List;


public interface UserMapper extends Mapper<UserInfo> {
    List<UserInfo> getUserList();
}

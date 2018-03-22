package com.icc.czx.one.service.mapper;

import com.icc.czx.one.model.UserInfoModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by czx on 2018/3/22.
 */
@Mapper
public interface OneServiceImplMapper {

    @Select("SELECT * FROM tb_user WHERE PHONE = #{phone}")
    UserInfoModel findUserByPhone(@Param("phone") String phone);
}

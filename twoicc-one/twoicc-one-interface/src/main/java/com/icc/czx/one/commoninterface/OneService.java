package com.icc.czx.one.commoninterface;

import com.icc.czx.one.model.UserInfoModel;

/**
 * Created by czx on 2018/3/22.
 */

public interface OneService {

    UserInfoModel findUserByPhone(String phone);
}

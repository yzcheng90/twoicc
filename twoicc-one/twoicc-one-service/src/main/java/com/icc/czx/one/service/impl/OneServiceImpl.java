package com.icc.czx.one.service.impl;

import com.icc.czx.one.commoninterface.OneService;
import com.icc.czx.one.model.UserInfoModel;
import com.icc.czx.one.service.mapper.OneServiceImplMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by czx on 2018/3/22.
 */
@Service("oneService")
public class OneServiceImpl implements OneService {

    @Autowired
    private OneServiceImplMapper oneServiceImplMapper;

    public UserInfoModel findUserByPhone(String phone) {
        return oneServiceImplMapper.findUserByPhone(phone);
    }
}

package com.icc.czx.one.api.controller;

import com.google.gson.Gson;
import com.icc.czx.common.web.controller.BaseController;
import com.icc.czx.one.commoninterface.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czx on 2018/3/22.
 */

@RestController
@RequestMapping("/api")
public class OneApiController extends BaseController{

    @Autowired
    private OneService oneService;

    @GetMapping("/index")
    public String getUserInfo(){
        String phone = "13888888888";
        String result = new Gson().toJson(oneService.findUserByPhone(phone));
        return "api to index" + result;
    }
}

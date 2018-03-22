package com.icc.czx.common.base;


/**
 * Created by czx on 2018/3/22.
 */
public class BaseResult {

    private int code = 500;
    private String message = "";
    private String data = "";

    public final static int ERROR = 401;
    public final static int SUCCESS = 200;
    public final static int FAIL = 500;
    public final static int TOKENFAIL = 1000;

    public static BaseResult success(String msg){
        BaseResult appBaseResult = new BaseResult();
        appBaseResult.setCode(SUCCESS);
        appBaseResult.setMessage(msg);
        return appBaseResult;
    }

    public static BaseResult success(){
        BaseResult appBaseResult = new BaseResult();
        appBaseResult.setCode(SUCCESS);
        appBaseResult.setMessage("请求成功");
        return appBaseResult;
    }

    public static BaseResult error(String msg){
        BaseResult appBaseResult = new BaseResult();
        appBaseResult.setCode(FAIL);
        appBaseResult.setMessage(msg);
        return appBaseResult;
    }

    public static BaseResult error(int code,String msg){
        BaseResult appBaseResult = new BaseResult();
        appBaseResult.setCode(code);
        appBaseResult.setMessage(msg);
        return appBaseResult;
    }

    public static BaseResult error() {
        return error(FAIL, "未知异常，请联系管理员");
    }


    public int getCode() {
        return code;
    }
    public BaseResult setCode(int status) {
        this.code = status;
        return this;
    }
    public String getMessage() {
        return message;
    }
    public BaseResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getData() {
        return  this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

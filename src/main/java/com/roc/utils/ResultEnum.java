package com.roc.utils;

import lombok.Getter;

/**
 * @author p
 */
@Getter
public enum ResultEnum {
    LOGIN_SUCCESS(0,"登录成功"),
    NO_EXIST_USER(1,"不存在该用户"),
    NO_LOGIN(2,"尚未登录,请登录!"),
    LACK_AUTHORITY(3,"权限不足，请联系管理员！"),
    USERNANE_OR_PASSWORD_ERROR(4,"账号或者密码输入错误！"),
    LOGIN_FAILURE(5,"登录失败"),
    LOGOUT_SUCCESS(6,"注销成功"),
    REGISTER_FAILURE(7,"注册失败"),
    USER_ALREDY_EXIST(8,"用户已存在"),
    REGISTER_SUCCESS(9,"注册成功"),
    FILE_UPLOAD_FAILURE(10,"文件上传失败,请重新上传！"),
    JSON_PARSE_EXCEPTION(11,"数据解析异常!"),
    FILE_SIZE_TOO_BIG(12,"图片大小不能超过3M！"),
    OPERATION_SUCCESS(13,"操作成功!"),
    OPERATION_FAILURE(14,"操作失败"),
    ATTENTION_FAILURE(15,"关注失败"),
    ATTENTION_SUCCESS(16,"关注成功"),
    CANCEL_SUCCESS(17,"取关成功"),
    PUBLIC_FAILURE(18,"发布失败"),
    PUBLIC_SUCCESS(19,"发布成功"),
    REPLY_SUCCESS(20,"回复成功"),
    REPLY_FAILURE(21,"回复失败"),
    LOGIN_EXPIRE(506,"登录过期，请重新登录!"),
    ;

    private Integer code;
    private String msg;
    ResultEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}

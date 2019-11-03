package com.roc.vo;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Roc
 * @version 1.0
 * @date 2019/11/3 13:14
 * @description 回复视图对象
 */
@Data
public class ReplyVo {

    private int userId;

    private String name;

    private String headImage;

    private int likeNum;

    private int unlikeNum;

    private String content;

    private Timestamp createTime;
}

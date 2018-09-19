package com.tiger.tgcloud.common.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: tiger
 * @date: 2018/9/19 11:55
 * @version: V1.0
 * @modified by:
 */
@Data
public class BaseQuery implements Serializable {

    private static final long serialVersionUID = 3319698607712846427L;

    /**
     * 当前页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 排序
     */
    private String orderBy;
}

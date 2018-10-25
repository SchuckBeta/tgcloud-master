package com.tiger.tgcloud.uac.service;

import com.github.pagehelper.PageInfo;
import com.tiger.tgcloud.uac.model.domain.UserInfo;
import com.tiger.tgcloud.uac.model.query.UserParam;

/**
 * @description:
 * @author: tiger
 * @date: 2018/10/24 16:20
 * @version: V1.0
 * @modified by:
 */
public interface UserService {
    /**
     * 分页查询用户列表
     *
     * @param param
     * @return
     */
    PageInfo<UserInfo> selectByConditionWithPage(UserParam param);

    /**
     * 根据ID查询用户信息
     *
     * @param userId
     * @return
     */
    UserInfo getUserById(Long userId);

    /**
     * 更新用户状态
     *
     * @param userInfo
     * @return
     */
    Boolean updateUserStatusById(UserInfo userInfo);

    /**
     * 更新用户状态
     *
     * @param userInfo
     * @return
     */
    Boolean updateUserById(UserInfo userInfo);

    /**
     * 添加用户
     *
     * @param userInfo
     * @return
     */
    Boolean addUser(UserInfo userInfo);
}

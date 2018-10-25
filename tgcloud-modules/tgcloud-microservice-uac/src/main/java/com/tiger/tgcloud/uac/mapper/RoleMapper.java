package com.tiger.tgcloud.uac.mapper;

import com.tiger.tgcloud.core.mybatis.MyMapper;
import com.tiger.tgcloud.uac.model.domain.RoleInfo;
import com.tiger.tgcloud.uac.model.query.RoleParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author: tiger
 * @date: 2018/10/24 16:50
 * @version: V1.0
 * @modified by:
 */
@Mapper
@Component
public interface RoleMapper extends MyMapper<RoleInfo> {
    /**
     * 根据条件查询用户信息
     *
     * @param param
     * @return
     */
    List<RoleInfo> selectByCondition(RoleParam param);
}

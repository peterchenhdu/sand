/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.shiro.service;


import com.github.peterchenhdu.sand.shiro.dto.ShiroPrincipal;
import com.github.peterchenhdu.sand.shiro.dto.TokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    TokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     *
     * @param userId
     */
    ShiroPrincipal queryUser(Long userId);
}

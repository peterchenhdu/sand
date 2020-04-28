/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.bizlog.service;


import java.util.Map;


/**
 * 业务日志
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public interface SysLogSaveService {

    void save(Map<String, Object> entity);

}

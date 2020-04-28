/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.quartz.service;

import com.github.peterchenhdu.sand.quartz.dto.ScheduleJobLogEntityDto;


/**
 * 定时任务日志
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public interface ScheduleJobLogSaveService {

    void save(ScheduleJobLogEntityDto params);

}

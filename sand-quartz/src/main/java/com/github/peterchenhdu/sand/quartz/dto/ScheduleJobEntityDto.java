/*
 * Copyright (c) 2020-2020 peterchenhdu (928651551@qq.com).
 *
 *      https://github.com/peterchenhdu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.peterchenhdu.sand.quartz.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public class ScheduleJobEntityDto implements Serializable {

    /**
     * 任务调度参数key
     */
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    /**
     * 任务id
     */
    private Long jobId;

    /**
     * spring bean名称
     */
    private String beanName;

    /**
     * 参数
     */
    private String params;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 任务状态
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;


    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

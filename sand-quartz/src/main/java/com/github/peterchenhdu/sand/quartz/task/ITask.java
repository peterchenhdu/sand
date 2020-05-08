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

package com.github.peterchenhdu.sand.quartz.task;

/**
 * 定时任务接口，所有定时任务都要实现该接口
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public interface ITask {

    /**
     * 执行定时任务接口
     *
     * @param params 参数，多参数使用JSON数据
     */
    void run(String params);
}
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

package com.github.peterchenhdu.sand.bizlog.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}

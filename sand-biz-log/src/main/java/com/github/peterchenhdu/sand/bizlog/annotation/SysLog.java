/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
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

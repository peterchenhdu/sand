/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.validator;

import com.github.peterchenhdu.sand.base.exception.BaseException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new BaseException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new BaseException(message);
        }
    }
}

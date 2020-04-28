/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.base.util.map;

import java.util.HashMap;


/**
 * 支持链式操作的Map
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public class ChainMap extends HashMap<String, Object> {

    @Override
    public ChainMap put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}

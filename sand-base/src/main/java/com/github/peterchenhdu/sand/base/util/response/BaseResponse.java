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

package com.github.peterchenhdu.sand.base.util.response;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 响应基类
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
public class BaseResponse extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public BaseResponse() {
        put("code", 0);
        put("msg", "success");
    }

    public static BaseResponse error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static BaseResponse error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, msg);
    }

    public static BaseResponse error(int code, String msg) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.put("code", code);
        baseResponse.put("msg", msg);
        return baseResponse;
    }

    public static BaseResponse error(HttpStatus code, String msg) {
        return error(code.value(), msg);
    }

    public static BaseResponse ok(String msg) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.put("msg", msg);
        return baseResponse;
    }

    public static BaseResponse ok(Map<String, Object> map) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.putAll(map);
        return baseResponse;
    }

    public static BaseResponse ok() {
        return new BaseResponse();
    }

    public BaseResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}

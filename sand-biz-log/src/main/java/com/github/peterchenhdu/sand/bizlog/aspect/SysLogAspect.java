/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.github.peterchenhdu.sand.bizlog.aspect;

import com.github.peterchenhdu.sand.base.util.JsonUtils;
import com.github.peterchenhdu.sand.base.util.http.HttpContextUtils;
import com.github.peterchenhdu.sand.base.util.http.IpUtils;
import com.github.peterchenhdu.sand.bizlog.annotation.SysLog;
import com.github.peterchenhdu.sand.bizlog.constant.BizLog;
import com.github.peterchenhdu.sand.bizlog.service.SysLogSaveService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * 系统日志，切面处理类
 *
 * @author chenpi
 * @since 1.0.0 2020/4/28 22:14
 **/
@Aspect
@Component
public class SysLogAspect {
    @Autowired
    private SysLogSaveService sysLogSaveService;

    @Pointcut("@annotation(com.github.peterchenhdu.sand.bizlog.annotation.SysLog)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        saveSysLog(point, time);

        return result;
    }

    private void saveSysLog(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        Map<String, Object> sysLog = new HashMap<>();
        SysLog syslog = method.getAnnotation(SysLog.class);
        if (syslog != null) {
            //注解上的描述
            sysLog.put(BizLog.OPERATION, syslog.value());
        }

        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLog.put(BizLog.METHOD, className + "." + methodName + "()");

        //请求的参数
        Object[] args = joinPoint.getArgs();
        try {
            String params = JsonUtils.toJson(args);
            sysLog.put(BizLog.PARAMS, params);
        } catch (Exception e) {

        }

        //获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        //设置IP地址
        sysLog.put(BizLog.IP, IpUtils.getIpAddr(request));

        //用户名
//        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
//        sysLog.setUsername(username);

        sysLog.put(BizLog.TIME, time);
        sysLog.put(BizLog.CREATE_DATE, new Date());
        //保存系统日志
        sysLogSaveService.save(sysLog);
    }
}

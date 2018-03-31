package com.rain.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 全局配置类,触发Servlet3.0扫描机制,配置Spring容器上下文
 * @author rain
 * created on 2018/3/31
 */
public class ZmallWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 配置Spring MVC拦截路径
     * @return url
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /**
     * 配置Spring容器上下文
     * @return config
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    /**
     * 配置Spring容器上下文
     * @return config
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }
}